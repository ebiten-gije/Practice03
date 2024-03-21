package com.javaex.practice03;

public class Ex08 {

	public static void main(String[] args) {
		
		int b = 1;
		
		while (b < 10) {
			
			int a = 2;
			
			while (a < 10) {
				
				System.out.print(a + "*" + b + "=" + (a*b) + "	");
						
				a++;		
			}
		
			System.out.println("");
			
			b++;
			
		}

	}

}
