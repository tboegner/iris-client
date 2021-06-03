#!/bin/bash

printf "\n  Build components and prepare release  \n\n"

# Get version number from version tag if this given
VERSION=`echo $1 | cut -d'v' -f2`
MAJOR=`echo $VERSION | cut -d'.' -f1`
MINOR=`echo $VERSION | cut -d'.' -f2`

echo "version = $VERSION"

# expect commit sha as second parameter
COMMIT=$2

printf "\n  Build NGINX image  \n\n"
docker build -t inoeg/iris-client-nginx ./infrastructure/docker/nginx/

docker tag genty/iris-client-nginx genty/iris-client-nginx:$VERSION
docker tag genty/iris-client-nginx genty/iris-client-nginx:$MAJOR
docker tag genty/iris-client-nginx genty/iris-client-nginx:$MAJOR.$MINOR

printf "\n  Build FE image  \n\n"
docker build -t inoeg/iris-client-frontend ./iris-client-fe/

docker tag genty/iris-client-frontend genty/iris-client-frontend:$VERSION
docker tag genty/iris-client-frontend genty/iris-client-frontend:$MAJOR
docker tag genty/iris-client-frontend genty/iris-client-frontend:$MAJOR.$MINOR

printf "\n  Set version to POMs and build BFF image and JAR  \n\n"
# Set new version in pom.xml using mvn versions:set command
mvn versions:set -DnewVersion=$VERSION -DprocessAllModules=true

# Package the new version and copy it to release folder
# These files will be upload to github by @semantic-release/github
mvn -B clean package spring-boot:repackage spring-boot:build-image -Dspring-boot.build-image.publish=false
mkdir release && cp ./iris-client-bff/target/*.jar release

docker tag genty/iris-client-bff:$VERSION genty/iris-client-bff:latest
docker tag genty/iris-client-bff:$VERSION genty/iris-client-bff:$MAJOR
docker tag genty/iris-client-bff:$VERSION genty/iris-client-bff:$MAJOR.$MINOR

# Set new version with prefix in pom.xml to avoid accidentally overwriting the release images in Docker.io after the merge back into develop.
# These new pom.xml and changelog.md generated by @semantic-release/changelog
# will be commit it by @semantic-release/git
mvn versions:set -DnewVersion=$VERSION-POST_RELEASE -DoldVersion=$VERSION -DprocessAllModules=true

printf "\n  Build FE ZIP  \n\n"
cd ./iris-client-fe
npm ci

export VUE_APP_BUILD_ID=$COMMIT
export VUE_APP_VERSION_ID=$VERSION
export VUE_APP_API_BASE_URL="/api"
npm run build
cd dist && zip -qq -r ../../release/iris-client-fe-$VERSION.zip *

printf "\n  Create ZIP of deployment scripts and instructions  \n\n"
cd ../../infrastructure/deployment && zip -qq -r ../../release/deployment-$VERSION.zip * .*

cd ../../

printf "\n  Push images and tags to docker registry  \n\n"

docker push genty/iris-client-bff:$VERSION
docker push genty/iris-client-bff:latest
docker push genty/iris-client-bff:$MAJOR
docker push genty/iris-client-bff:$MAJOR.$MINOR

docker push genty/iris-client-frontend:$VERSION
docker push genty/iris-client-frontend:latest
docker push genty/iris-client-frontend:$MAJOR
docker push genty/iris-client-frontend:$MAJOR.$MINOR

docker push genty/iris-client-nginx:$VERSION
docker push genty/iris-client-nginx:latest
docker push genty/iris-client-nginx:$MAJOR
docker push genty/iris-client-nginx:$MAJOR.$MINOR

printf "\n  COMPLETED: Build components and prepare release  \n\n"

#printenv 
