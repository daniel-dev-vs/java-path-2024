package com.pluralsight.primitivedata;

public class Variable{
	public static void main(String [] args){
		
		final int imutableVariable = 1;	
		System.out.println("Teste");
		System.out.println(imutableVariable);
	
		System.out.println(imutableVariable);
        integerValues();
		floatValues();
		charValues();
		booleanValues();
	}


	/**
	 *  This method will show the range of values that can be stored in the primitive data types in java
	 * */
	private static void integerValues(){
	
		byte exByte = 8; // bytes is the most short range storeable in java - 8 bits - min: -128 / max:127 	
	
		short exShort = 16; // short is the second minimum range in java - 16 bits -32768 to 32767 
	    
        int exInt = 32; // int have thirty two bits 
    
        double exDouble = 64; // double have 64 bits and can hold numbers between -2147483648 to 214783647. 

		System.out.printf("byte is %d bits and can hold 128 positive/negative numbers\n", exByte);
		System.out.printf("short is %d bits and can hold 32767 positive/negative numbers\n", exShort);
		System.out.printf("int is %d bits and can hold 2147483647 positive/negative numbers\n", exInt);
		System.out.printf("double is %f bits and can hold plus 1 trillions positive/negative numbers\n", exDouble);
    }

	public static void floatValues(){
		float exFloat = 32.0f; // float have 32 bits and can hold numbers between -1.4x10^-45 to 3.4x10^-38.
		System.out.printf("float is %f bits and can hold positive/negative floating numbers\n", exFloat);

		double exDouble = 32.00d; // float have 32 bits and can hold numbers between -1.4x10^-45 to 3.4x10^-38.
		System.out.printf("float is %f bits and can hold positive/negative floating numbers\n", exFloat);
	}
	public static void charValues(){
		char exChar = 'a'; // char have
		System.out.printf("char is %c bits and can hold single characters \n", exChar);
	}

	public static void booleanValues(){
		boolean exBoolean = true; // boolean have
		System.out.printf("boolean is %b bits and can hold true or false values \n", exBoolean);
	}
}	








