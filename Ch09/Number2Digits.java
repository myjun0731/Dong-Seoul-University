package Ch09;

import java.util.Random;
import java.util.Scanner;

public class Number2Digits {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		Random rand = new Random();
		int no = 10 + rand.nextInt(90);
		int input = 0;

		System.out.println("No : " + no);
		System.out.println();
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("(10 ~ 99)");
		do {
			System.out.print("어떤 숫자일까요?");
			input = stdIn.nextInt();

			if (input > no) {
				System.out.println("더 작은 숫자입니다.");
			} else if (input < no) {
				System.out.println("더 큰 숫자입니다.");
			}
		} while (no != input);

		System.out.println("정답입니다.");

	}
}