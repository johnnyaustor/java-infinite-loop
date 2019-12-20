import java.util.Scanner;

/**
 * Application
 */
public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value;

        while (true) {
            System.out.println("Enter letter:");
            System.out.println("for Close type 'q'");
            value = scanner.nextLine();

            if (value.equals("q")) {
                scanner.close();
                break;
            }
        }
    }
}