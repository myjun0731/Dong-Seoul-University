package Ch04;

import java.util.*;

public class Scan03 {
	public static void main(String[] args) {
		Scanner stdfl = new Scanner(System.in);

		System.out.println("x값 : ");
		float x = stdfl.nextFloat();
		System.out.println("y값 : ");
		float y = stdfl.nextFloat();

		System.out.println("합계는 " + (x + y) + "입니다.");
		System.out.println("평균은 " + ((x + y) / 2) + "입니다.");
	}
}
