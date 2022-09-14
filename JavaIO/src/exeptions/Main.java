package exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // int x = 98;
        // int y = 0;
        // System.out.println(devideLBYL(x, y));
        // System.out.println(devideEAFP(x, y));
        // System.out.println(devide(x, y));
        int x = getIntEAFP();
        System.out.println("X is " + x);
    }

    private static int getInt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int getIntLBYL() {
        Scanner scanner = new Scanner(System.in);
        String inputValue = scanner.next();

        for (int i = 0; i < inputValue.length(); i++) {
            if(!Character.isDigit(inputValue.charAt(i))) {
                return 0;
            }
        }

        int inputValueToNum = Integer.parseInt(inputValue);

        return inputValueToNum;
    }

    private static int getIntEAFP() {
        Scanner scanner = new Scanner(System.in);

        try {
            return scanner.nextInt();
        } catch (InputMismatchException err) {
            return 0;
        }
    }

    private static int devideLBYL(int x, int y) {
        if(y != 0) {
            return x / y;
        } else {
            return 0;
        }
    }

    private static int devideEAFP(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException err) {
            return 0;
        }
    }

    private static int devide(int x, int y) {
        return x / y;
    }
}
