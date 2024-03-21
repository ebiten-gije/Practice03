package com.javaex.practice03;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int a = scanner.nextInt(), c = 0;
		
		for (int b = 1; b <= a; b++) {
			
			System.out.print(b);
			
			c += b;
			
			if (b >= a) {
				
				break;
				
			}
			
			System.out.print("+");
			
		}
		
		System.out.println("\n합계: " + c);
		
		scanner.close();

	}

}
