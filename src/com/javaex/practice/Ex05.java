package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] total = new int[5];  
		int i;
		int average;
		int sum=0;
		
		
		for(i=0; i<total.length; i++) {
			int num = sc.nextInt();
			total[i] = num;
			
			sum += total[i]; // 숫자를 더한값 sum = sum+total[i]
			}
		
		
		average = sum/total.length; // 평균
		
		System.out.println("평균은 " + (float)average + " 입니다.");
		
		sc.close();
				
				

	}

}
