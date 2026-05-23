package Ch09;

import java.util.Scanner;

public class SimpleOperation {
	public static int simpleOpr(int n1, int n2) {
		int count = 0;

		int Result[] = new int[5];
		Result[0] = n1 + n2;
		Result[1] = n1 - n2;
		Result[2] = n1 * n2;
		Result[3] = n1 / n2;
		Result[4] = n1 % n2;

		count++;
		return Result[count];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		System.out.print("n1 : ");
		n1 = sc.nextInt();
		System.out.print("n2 : ");
		n2 = sc.nextInt();

		System.out.print("덧셈 결과:");
		simpleOpr(n1, n2);
		System.out.print("뺄셈 결과:");
		simpleOpr(n1, n2);
		System.out.print("곱셈 결과:");
		simpleOpr(n1, n2);
		System.out.print("나눗셈 결과:");
		simpleOpr(n1, n2);
		System.out.print("나눗셈 나머지 결과:");
		simpleOpr(n1, n2);

	}
}
