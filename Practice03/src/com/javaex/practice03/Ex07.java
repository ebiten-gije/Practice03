package com.javaex.practice03;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int a = scanner.nextInt();
		
		for (int b = 1; b <= a; b++) {

			for (int c = 1; c <= b; c++) {
				
				System.out.print(b);
			
			}
			
			System.out.println("");
			
		}
		
		scanner.close();
		
	}

}
