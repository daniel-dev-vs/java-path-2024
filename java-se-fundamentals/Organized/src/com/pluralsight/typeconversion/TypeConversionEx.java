package com.pluralsight.typeconversion;

public class TypeConversionEx{

    public static void main(String[] args) {
        float floatVal = 1.0f;
        double doubleVal = 4.0d;
        byte byteVal = 7;
        short shortVal = 7;
        long longVal = 4;

        short result1 = byteVal; //automatically widening conversion. implicit conversion

        short result2 = (short)longVal; //explicit narrowing conversion, cast
        short result3 = (short)(byteVal - longVal); // explicit narrowing conversion with precedence order and cast.
        //long result4 = longVal - floatVal; wrong.
        float result4 = longVal - floatVal;

        System.out.println("success");
    }
}