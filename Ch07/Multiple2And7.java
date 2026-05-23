package Ch07;

public class Multiple2And7 {
	public static void main(String[] args) {
		int Num = 1000;
		int sum = 0;
//		for (int i = 0; i <= Num; i++) {
//			if (i % 2 == 0 && i % 7 == 0) {
//				System.out.println(i);
//				sum += i;
//			}
//		}
		System.out.println("합 : " + sum);

		int i = 0;
		while (i <= Num) {
			if (i % 2 == 0 && i % 7 == 0) {
				System.out.println(i);
				sum += i;
			}
			i++;
		}
		System.out.println("합 : " + sum);
	}
}
