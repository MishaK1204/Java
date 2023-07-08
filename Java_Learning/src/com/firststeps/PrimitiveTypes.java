package com.firststeps;

public class PrimitiveTypes {

    public static void main(String[] args) {
        byte value1 = 3;
        short value2 = 50;
        int value3 = 500;

        int sumOfThree = value1 + value2 + value3;

        long value4 = 50000L + 10L * sumOfThree;

        System.out.println(value4);
    }
}
