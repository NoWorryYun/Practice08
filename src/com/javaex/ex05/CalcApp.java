package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print(">>");
			String num = sc.nextLine();

			if (num.equals("/q")) {
				break;
			}

			String[] split = num.split(" ");
			int a = Integer.parseInt(split[0]);
			int b = Integer.parseInt(split[2]);
			if (split[1].equals("+")) {
				Add divide = new Add();
				divide.setValue(a, b);
				System.out.println(divide.calculate());
				System.out.println(">>" + result);
			} else if (split[1].equals("-")) {
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[2]);
				int result = a - b;
				System.out.println(">>" + result);
			} else if (split[1].equals("/")) {
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[2]);
				int result = a / b;
				System.out.println(">>" + result);
			} else if (split[1].equals("*")) {
				int a = Integer.parseInt(split[0]);
				int b = Integer.parseInt(split[2]);
				int result = a * b;
				System.out.println(">>" + result);
			} else {
				System.out.println("알 수 없는 연산입니다.");
			}
		}
		sc.close();
	}
}
