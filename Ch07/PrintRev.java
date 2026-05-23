package Ch07;

public class PrintRev {
	public static void main(String[] args) {
		int num = 1;

		while (num <= 100) {
			System.out.println(num++);
		}
		System.out.println("===");
		do {
			System.out.println(--num);
		} while (num > 1);
	}
}
