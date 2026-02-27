package me.raineri;

import me.raineri.client.YampiConfig;
public class YampiClient {

    private final YampiConfig config;

    private YampiClient(Builder builder) {
        this.config = new YampiConfig(
                builder.storeAlias,
                builder.userToken,
                builder.userSecretToken,
                builder.environment
        );
    }

    public static Builder builder() {
        return new Builder();
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

        public Builder setUserSecretToken(String token) {
            this.userSecretToken = token;
            return this;
        }

        public Builder setEnvironment(String environment) {
            this.environment = environment;
            return this;
        }

        public YampiClient build() {

            if (storeAlias == null || storeAlias.isBlank())
                throw new IllegalStateException("Store alias is required");

            if (userToken == null || userToken.isBlank())
                throw new IllegalStateException("User token is required");

            if (userSecretToken == null || userSecretToken.isBlank())
                throw new IllegalStateException("User secret token is required");

            return new YampiClient(this);
        }
    }
}