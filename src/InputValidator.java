import java.util.Scanner;

class InputValidator {
    private static Scanner sc = new Scanner(System.in);

    public static int getValidInt(String prompt) {
        while (true) {
            System.out.print(prompt);
            try {
                int val = Integer.parseInt(sc.nextLine());
                if (val < 0) throw new Exception("No negative numbers!");
                return val;
            } catch (Exception e) {
                System.out.println("Error: Please enter a valid positive number.");
            }
        }
    }

    public static String getValidString(String prompt) {
        while (true) {
            System.out.print(prompt);
            String input = sc.nextLine();
            if (input.trim().isEmpty()) {
                System.out.println("Error: Input cannot be empty.");
            } else {
                return input;
            }
        }
    }
}
