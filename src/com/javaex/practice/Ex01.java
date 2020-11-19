package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		int[] intArray = new int[5];
		
		intArray[0]=1;
		intArray[1]=2;
		intArray[2]=3;
		intArray[3]=4;
		intArray[4]=5;
		
		int result = 0;
		
		for(int i =0; i<intArray.length; i++) {
			
			//result =result + intArray[i];
			result += intArray[i]; //
			
			// result = 0 초기값선언
			// result = 0 + 1
			// result = 1 + 2
			// result = 3 + 3
			// result = 6 + 4
			// result = 10 + 5 //결과값 15
		}
		
		System.out.println(result);
		
	}

}
