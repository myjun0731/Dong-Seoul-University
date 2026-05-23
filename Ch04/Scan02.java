package Ch04;

import java.util.*;

public class Scan02 {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("정수 값 : ");
		int x = stdIn.nextInt();

		System.out.println("마지막 자릿수를 제외한 값은 " + (x / 10) + "입니다.");
		System.out.println("마지막 자릿수는 " + (x % 10) + "입니다.");
	}
}
