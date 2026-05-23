package Ch06;

import java.util.Scanner;

public class bitSet {
	public static void main(String[] args) {
		int num = 0;
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("세팅할 비트를 입력하시오.(1~8): ");
			int scNum = sc.nextInt();

			if (!(scNum >= 1 && scNum <= 8)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

			if (scNum < 1 || scNum > 8) {
				System.out.println("잘못된 입력입니다. 1~8 사이의 숫자를 입력해주세요.\n");
				continue;
			}

			num = num | (1 << (scNum - 1));

			System.out.print("현재 비트 상태: ");
			for (int i = 7; i >= 0; i--) {
				System.out.print((num >> i) & 1);
			}
			System.out.println("\n");
		}

		sc.close();
	}
}