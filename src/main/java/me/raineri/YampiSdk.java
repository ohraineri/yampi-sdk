package me.raineri;

import me.raineri.client.YampiConfig;

public class YampiSdk
{
    private YampiConfig instanceConfiguration;

    public static Builder builder() {
        return new Builder();
    }


    private YampiSdk(Builder builder) {
        this.instanceConfiguration = builder.instanceConfiguration;
    }

    public static class Builder {
        private String storeAlias;
        private String userToken;
        private String userSecretToken;
        private String environment;

        public Builder setAlias(String aliasName) {
            this.storeAlias = aliasName;
            return this;
        }

        public Builder setUserToken(String userToken) {
            this.userToken = userToken;
            return this;
        }

        public Builder setUserSecretToken(String userSecretToken) {
            this.userSecretToken = userSecretToken;
            return this;

        }

        public Builder setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }

        public YampiSdk build() {
            if (storeAlias == null || storeAlias.isBlank())
                throw new IllegalStateException("Store alias is required");
            if (userToken == null || userToken.isBlank())
                throw new IllegalStateException("User token is required");
            if (userSecretToken == null || userSecretToken.isBlank())
                throw new IllegalStateException("user secret token is required");
            this.instanceConfiguration = new YampiConfig(storeAlias, userToken, userSecretToken, environment);
            return new YampiSdk(this);
        }

    }
}
