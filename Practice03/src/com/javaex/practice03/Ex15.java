package com.javaex.practice03;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
		
		int a = scanner.nextInt(), b = 1;
		
		while (b <= a) {
			
			if (a % b == 0) {
				
				System.out.println(b);
				
			}
			
			b++;
			
		}
		
		scanner.close();

	}

}
