import me.raineri.YampiSdk;

public class BuilderExample {
    public static void main(String[] args) {
        YampiSdk sdk = YampiSdk.builder()
                .setAlias("storemarcelo")
                .setUserToken("tryHackMe")
                .setUserSecretToken("ohh_secret")
                .setEnvironment("prod")
                .build();

    }
}
