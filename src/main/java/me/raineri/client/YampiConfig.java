package me.raineri.client;

public class YampiConfig {
    private final String alias;
    private final String userToken;
    private final String userSecretToken;
    private final String environment;

    public YampiConfig(String alias, String userToken, String userSecretToken, String environment) {
        this.alias = alias;
        this.userToken = userToken;
        this.userSecretToken = userSecretToken;
        this.environment = environment;
    }
}
