package com.javaex.practice03;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int a = scanner.nextInt(), c = 0, d = 0;
		
		for (int b = 1; b <= a; b++) {
			
			if (b % 5 == 0) { 
				
				c += b;
				
				d += 1;
				
			}
				
		}
		
		System.out.println("5의 배수의 갯수: " + d);
		
		System.out.println("5의 배수의 합: " + c);
		
		scanner.close();

	}

}
