package com.javaex.practice;

public class Ex06 {

	public static void main(String[] args) {
		
		
		char c[] = {'T','h','i','s',' ','i','s',' ','a',' ','p','e','n','c','i','l'};
		
		
		int i;
		
		for(i=0; i<c.length; i++) {
			
			System.out.print(c[i]);
		}
		
		System.out.println("");
		
		for(i=0; i<c.length; i++) {
			
			if(c[i]==' ') {
				
				c[i] = ','; //공백이 들어간 값을 , 로 바꿔줌
			}
			
			System.out.print(c[i]);
		}
	}

}
