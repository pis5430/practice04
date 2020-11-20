package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int[] total = new int[5];  //갯수만 잡아줌 -->입력받아야함
		
		int i; 
		int average;
		int sum=0; //0으로 초기값을 잡아줘야함
		
		
		for(i=0; i<total.length; i++) {
			int num = sc.nextInt();
			total[i] = num;
			
			//예시
			//total[0] 1번 입력 = 10  --> 0+10 = 10
			//total[1] 2번 입력 = 20  --> 10+20 = 30
			//total[2] 3번 입력 = 30  --> 30+30 = 60
			//total[3] 4번 입력 = 40  --> 60+40 = 100
			//total[4] 5번 입력 = 50  --> 100+50 = 150
			
			sum += total[i]; // 숫자를 더한값 sum = sum+total[i]
			}	
		
		average = sum/total.length; // 평균
		
		// avverage = 150/5
		
		System.out.println("평균은 " + (float)average + " 입니다.");
		

		sc.close();
				
				

	}

}
