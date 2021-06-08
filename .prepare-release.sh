#!/bin/bash

printf "\n  Build components and prepare release  \n\n"

# Get version number from version tag if this given
VERSION=`echo $1 | cut -d'v' -f2`
echo "version = $VERSION"

# expect commit sha as second parameter
COMMIT=$2

printf "\n  Build NGINX image  \n\n"
docker build -t tboegner/iris-client-nginx ./infrastructure/docker/nginx/

printf "\n  Build FE image  \n\n"
docker build -t tboegner/iris-client-frontend ./iris-client-fe/

printf "\n  Set version to POMs and build BFF image and JAR  \n\n"
# Set new version in pom.xml using mvn versions:set command
mvn versions:set -DnewVersion=$VERSION -DprocessAllModules=true

# Package the new version and copy it to release folder
# These files will be upload to github by @semantic-release/github
mvn -B clean package spring-boot:repackage spring-boot:build-image -Dspring-boot.build-image.publish=false
mkdir release && cp ./iris-client-bff/target/*.jar release

# Set new version with prefix in pom.xml to avoid accidentally overwriting the release images in Docker.io after the merge back into develop.
# These new pom.xml and changelog.md generated by @semantic-release/changelog
# will be commit it by @semantic-release/git
mvn versions:set -DnewVersion=$VERSION-POST_RELEASE -DprocessAllModules=true

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

printf "\n  COMPLETED: Build components and prepare release  \n\n"

#printenv 
