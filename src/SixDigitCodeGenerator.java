import java.io.FileWriter;
import java.io.IOException;

public class SixDigitCodeGenerator {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            // Format each number to a 6-digit code with leading zeros if necessary
            String code = String.format("%06d", i);
            System.out.print(code+" , "); // Print each code
        }
    }
}
