package com.javaex.practice03;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int a = scanner.nextInt(), b = 1, ko = 1;
		
		while (b <= a) {
			
			ko = ko * b;
			
			b++;		
					
		}
		
		System.out.println(ko);
		
		scanner.close();

	}

}
