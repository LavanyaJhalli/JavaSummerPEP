package day4;
import java.util.Scanner;

public class AnimatedHollowButterfly {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        // Upper half
        for (int i = 1; i <= n; i++) {
            printLine(i, n);
            Thread.sleep(200); // 200 milliseconds pause
        }

        // Lower half
        for (int i = n; i >= 1; i--) {
            printLine(i, n);
            Thread.sleep(400); // 200 milliseconds pause
        }

        sc.close();
    }

    static void printLine(int i, int n) {
        // Left wing
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i)
                System.out.print("*");
            else
                System.out.print(" ");
        }

        // Spaces between wings
        for (int j = 1; j <= 2 * (n - i); j++) {
            System.out.print(" ");
        }

        // Right wing
        for (int j = 1; j <= i; j++) {
            if (j == 1 || j == i)
                System.out.print("*");
            else
                System.out.print(" ");
        }

        System.out.println();
    }
}
