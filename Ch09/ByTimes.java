package Ch09;

import java.util.Scanner;

public class ByTimes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("단수 : ");
		printByTimes(sc.nextInt());
	}

	public static void printByTimes(int n) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(n + " X " + i + "=" + (n * i));
		}
	}
}
