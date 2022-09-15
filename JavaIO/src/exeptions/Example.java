package exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        int result = devide();
        System.out.println(result);
    }

    public static int devide() {
        int x = getInt();
        int y = getInt();
        System.out.println("X is " + x + ", Y is " + y);

        return x / y;
    }

    public static int getInt() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number: ");

        while (true) {
            try {
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Please enter valid number: ");
            }
        }
    }
}
