package by.htp.les5;

import java.util.Scanner;

public class Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int sum;

		a = enterFromConsole("a >> "); // точка вызова метода
		b = enterFromConsole("b >> ");

		sum = sum(a, b); // фактические параметры
		System.out.println(a + " + " + b + " = " + sum);

	}

	public static int sum(int x1, int x2) { // формальные параметры
		int sum;
		sum = x1 + x2;
		return sum; // или return x1 + x2
	}

	public static int enterFromConsole(String message) {
		// описание метода
		@SuppressWarnings("resource") // аннотация -- означает что метод close для sc не вызываем
		Scanner sc = new Scanner(System.in);
		int value;
		System.out.print(message);

		while (!sc.hasNextInt()) {
			sc.next();
			System.out.print(message);
		}
		value = sc.nextInt();
		return value;
	}

}
