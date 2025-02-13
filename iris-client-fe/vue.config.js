module.exports = {
  transpileDependencies: ["vuetify"],
  chainWebpack: (config) => {
    config.plugin("html").tap((args) => {
      const htmlConfig = args[0];
      htmlConfig.irisAppContext = {
        apiBaseURL: process.env.VUE_APP_API_BASE_URL,
        localContactPerson: {
          name: process.env.VUE_APP_LOCAL_CONTACT_PERSON_NAME,
          mail: process.env.VUE_APP_LOCAL_CONTACT_PERSON_MAIL,
          phone: process.env.VUE_APP_LOCAL_CONTACT_PERSON_PHONE,
        },
      };
      return args;
    });
  },
};
