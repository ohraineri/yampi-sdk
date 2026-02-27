package me.raineri;

public class TestSdk {
    public static void main(String[] args) {

        YampiSdk sdk = YampiSdk.builder()
                .setAlias("store123")
                .setUserToken("token")
                .setUserSecretToken("secret")
                .setEnvironment("prod")
                .build();

        System.out.println("SDK criado com sucesso!");
    }
}
