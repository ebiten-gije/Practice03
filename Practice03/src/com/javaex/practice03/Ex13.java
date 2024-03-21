package com.javaex.practice03;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요: ");
	
		int a = scanner.nextInt(), ko = 0;
		
		for (int b = 1; b <= a; b +=1) {
			
			ko += b;
			
		}
		
		System.out.println("합계: " + ko);
		
		scanner.close();

	}

}
