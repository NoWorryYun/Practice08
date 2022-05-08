package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String num = sc.nextLine();

			if (num.equals("/q")) {
				System.out.println("종료합니다.");
				break;
			} else {

				try {
					String[] split = num.split(" ");

					int a = Integer.parseInt(split[0]);
					int b = Integer.parseInt(split[2]);
					
					if (split[1].equals("+")) {
						Add add = new Add();
						add.setValue(a, b);
						System.out.println(add.calculate());
					} else if (split[1].equals("-")) {
						Sub minus = new Sub();
						minus.setValue(a, b);
						System.out.println(minus.calculate());
					} else if (split[1].equals("/")) {
						Div divide = new Div();
						divide.setValue(a, b);
						System.out.println(divide.calculate());
					} else if (split[1].equals("*")) {
						Mul times = new Mul();
						times.setValue(a, b);
						System.out.println(times.calculate());
					}
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("알 수 없는 연산입니다.");
				}
				
			}
		}
		sc.close();
	}
}
