import java.util.Random;

public class FacebookCodeGenerator {
    public static void main(String[] args) {
        Random random = new Random();

        // Generate a random 6-digit code
        int code = 100000 + random.nextInt(900000); // Ensures the number is between 100000 and 999999
        System.out.println("Your Facebook verification code is: " + code);
    }
}
