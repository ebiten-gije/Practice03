package com.javaex.practice03;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		
		int a = scanner.nextInt();
		
		while (a > 0) {

			for (int b = a; b > 0; b--) {
				
				System.out.print("*");
				
			}
			
			System.out.println("");
			
			a--;
			
		}
		
		scanner.close();

	}

}
