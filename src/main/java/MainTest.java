
@LoadMarketingOffer()
public class MainTest {
    public static void main(String[] args) {
        String clientId = generateClient();
        System.out.println("Test run with clientId = " + clientId);

    }

    public static String generateClient() {
        return "1-QWERTY";
    }

}
