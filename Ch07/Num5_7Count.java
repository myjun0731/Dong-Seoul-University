package Ch07;

public class Num5_7Count {
	public static void main(String[] args) {
		int num = 1;
		int count = 0;
		while (num <= 100) {
			if ((num % 5 == 0) && (num % 7 == 0)) {
				System.out.println(num);
				count++;
			}
			num++;
		}
		System.out.println("count : " + count);
	}
}
