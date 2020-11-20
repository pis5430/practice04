package com.javaex.practice;

public class Ex02 {

	public static void main(String[] args) {
		
		
		double[] num = new double[] {1.2,3.3,6.7};
		
		int i; //횟수
		
		
		// 순서대로 나오는 방법
		
		/*
		for(i=0; i<num.length; i++) {
			
			System.out.println(num[i]);
		}
		*/
		
		// 반대방향으로 나오는 방법01
		
		/*
		for(i=2; i<=num.length-1 && i>=0; i--) {
		
			System.out.println(num[i]);
		}
		*/
		
		// 반대방향으로 나오는 방법02
		
		for(i=num.length-1; i>-1; i--) { 
			
			System.out.println(num[i]);
		}

	}

}
