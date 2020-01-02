import java.util.Scanner;

public class ChapterOne {
    public static void main(String[] args) {
        int x = 5;
        String name = "Brock";
        while (x >= 5) {
            x = x - 1;
            if (x >= 5) {
                System.out.println("X equals 5");
            } else {
                System.out.println("X equals 4 and my name is " + name);
            }
            Scanner reader = new Scanner(System.in);
            System.out.println("It's 2020! What is a goal you have?");
            String n = reader.nextLine();
            reader.close();
            System.out.print("Your goal is: " + n + "\n");
        }

    }
}