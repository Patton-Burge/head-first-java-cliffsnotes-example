import java.util.Scanner;

public class ChapterOne {
    public static void main(String[] args) {
        int x = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        scanner.close();
        while (x <= 5) {
            x = x - 1;
            if (x == 1) {
                System.out.println("Your name is " + name);
            }
        }
        System.out.println("Thank you for using my application");
    }
}