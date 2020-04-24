package by.htp.les5;

import java.util.Scanner;

public class Mail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int sum;

		a = enterFromConsole("a >> "); // ����� ������ ������
		b = enterFromConsole("b >> ");

		sum = sum(a, b); // ����������� ���������
		System.out.println(a + " + " + b + " = " + sum);

	}

	public static int sum(int x1, int x2) { // ���������� ��������� кодировка ютиф8
		int sum;
		sum = x1 + x2;
		return sum; // ��� return x1 + x2
	}

	public static int enterFromConsole(String message) {
		// �������� ������
		@SuppressWarnings("resource") // ��������� -- �������� ��� ����� close ��� sc �� ��������
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
