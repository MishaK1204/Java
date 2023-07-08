package com.fundamentals.typeconversion;

public class TypeConversion {
    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 5;

        short result1 = (short) longVal;
        short result2 = (short) (byteVal - longVal);
        float result3 = longVal - floatVal;

        var v1 = 50;
        v1 = (int) 100.0;

        var thisValue = 7.5f; // thisValue is a float
        v1 = (int) thisValue;

        System.out.println("Success");
    }
}
