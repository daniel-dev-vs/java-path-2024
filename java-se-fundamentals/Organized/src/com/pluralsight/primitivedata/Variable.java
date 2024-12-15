package com.pluralsight.primitivedata;

public class Variable{
	public static void main(String [] args){
		
		final int imutableVariable = 1;	
		System.out.println("Teste");
		System.out.println(imutableVariable);
	
		System.out.println(imutableVariable);
        integerValues();	
	}


	private static void integerValues(){
	
		byte exByte = 8; // bytes is the most short range storeable in java - 8 bits - min: -128 / max:127 	
	
		short exShort = 16; // short is the second minimum range in java - 16 bits -32768 to 32767 
	    
        int exInt = 32; // int have thirty two bits 
    
        double exDouble = 64; // double have 64 bits and can hold numbers between -2147483648 to 214783647. 
    
        System.out.printf("byte is {0} bits and can hold 128 positive/negative numbers\n",exByte);
        System.out.printf("byte is {0} bits and can hold 32767 positive/negative numbers\n",exShort);
        System.out.printf("byte is {0} bits and can hold 2147483647 positive/negative numbers\n",exInt);
        System.out.printf("byte is {0} bits and can hold plus 1 trillions positive/negative numbers\n",exDouble);
    }
}	








