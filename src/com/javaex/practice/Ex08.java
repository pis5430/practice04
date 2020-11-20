package com.javaex.practice;

public class Ex08 {

	public static void main(String[] args) {
		
		
		// 다른방법있는지 확인
		
		int[] lotto = new int[6]; 
		int i;
		int j; 
		
		for(i = 0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45)+1;  //랜덤번호 부여
		
			for(j = 0; j<i; j++) {
				if(lotto[j]==lotto[i]) {
				//lotto[i]-=1; // --> 이렇게 하면 0값이 나올수도 있음
				i--;	//중복됬을 경우 다시계산, i값이 바뀌면서 숫자를 다시 뽑음 
				}
			}
		}
		
		//위에서 중복된 번호 제외
		
		for(i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
	
		

	}

}
