package com.javaex.practice03;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String num = "숫자: ";
		
		System.out.print("숫자를 입력하세요." + "\n");
		
		int a = 0, b = 0;
		
		while (b < 5) {
			
			System.out.print(num);
			
			int c = scanner.nextInt();
			
			b++;
			
			if (a < c) {
				
				a = c;
			
			}
			
		}
		
		System.out.println("최대값은 " + a + "입니다.");
	
		scanner.close();
		
	}

}
