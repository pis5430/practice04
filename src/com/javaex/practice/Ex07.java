package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] wonArray = new int[] {50000,10000,5000,1000,500,100,50,10,5,1};
		
		int count=0;
		
		//배열 개수 10개

		System.out.print("금액: ");
		int money = sc.nextInt();
		
		for(int i =0; i<wonArray.length; i++) {
			
			count = money/wonArray[i]; // 개수
			money -= (wonArray[i]*count); // 앞에서 계산된 갚을 빼주기
		
			System.out.println(wonArray[i] +"원: " + count+"개");
		}
		
		
		
		sc.close();


	}

}
