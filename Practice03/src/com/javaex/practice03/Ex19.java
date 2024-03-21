package com.javaex.practice03;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);		
		
		String str = "------------------------------\n1.예금 | 2.출금 |"
				+ " 3.잔고 | 4.종료\n------------------------------";
		
		int sel = 0, kou = 0;
		
		for ( ;!(sel == 4); ) {
			
			System.out.println(str);
			
			sel = scanner.nextInt();
			
			switch (sel) {
			
			case 1 : System.out.print("예금액>");
			int a = scanner.nextInt();
			kou += a;
		
			break;
			
			case 2 : System.out.print("출금액>");
			int b = scanner.nextInt();
			kou -= b;
			
			break;
			
			case 3 : System.out.print("잔고액>");
			System.out.println(kou);
			
			break;
			
			case 4 : System.out.println("프로그램 종료");
			
			break;
			
			default : System.out.println("다시입력해주세욧");
			
			break;
			
			}
		
			scanner.close();
		
		}

	}

}
