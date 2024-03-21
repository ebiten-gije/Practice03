package com.javaex.practice03;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("================================\n	[숫자 맞추기"
					+ " 게임 시작]	\n================================");
			
			int num = (int) (Math.random()*100)+1;
			
			while (true) {
				
				System.out.print(">>");	
			
				int cot = scanner.nextInt();
				
				if (num == cot) {
					System.out.println("정답입니다!");
					break;
				} else if (num > cot) {
					System.out.println("더 높아야할 듯..");
				} else {
					System.out.println("더 낮아야..");
				}
				
			}
			
			System.out.print("다시 하시겠습니까??? (y/n) >>");
			
			String str = scanner.next();
			
			if (str.equals("n")) {	//여기 어떻게 해야 하지?
				break;
			}
			
			if (str.equals("y")) {
				continue;
			} else {
				System.out.println("그냥 한 번 더 해라.");
				continue;
			}
			
		}
		System.out.println("================================\n	[숫자 맞추기 게임 종료]"
				+ "		\n================================");
		scanner.close();
	}

}
