import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        for (int i = 1; i <= input.length(); i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 4 && i == 1) {
                    System.out.print(input.charAt(i-1));
                } else if (j >= 3 && j <= 5 && i == 2) {
                    System.out.print(input.charAt(i-1));
                } else if (j >= 2 && j <= 6 && i == 3) {
                    System.out.print(input.charAt(i-1));
                } else if (j >= 1 && j <= 7 && i == 4) {
                    System.out.print(input.charAt(i-1));
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
