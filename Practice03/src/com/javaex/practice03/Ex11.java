package com.javaex.practice03;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요.");
		
		int num = scanner.nextInt();
		
		int tasu = 0;
		
		if (num % 2 == 0) {
			
			for (int a = 2; a <= num; a += 2) {
				
				tasu += a;
				
			}
			
		} else {
			
			for (int a = 1; a <= num; a += 2) {
				
				tasu += a;
				
			}
			
		}
		
		System.out.println(tasu);
		
		scanner.close();
		
	}	

}