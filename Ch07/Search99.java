package Ch07;

public class Search99 {
	public static void main(String[] args) {
		for (int a = 1; a < 10; a++) {
			for (int b = 1; b < 10; b++) {

				int ab = (10 * a) + b;
				int ba = (10 * b) + a;

				if (ab + ba == 99) {
					System.out.println("A = " + a + ", B = " + b + "  (확인: " + ab + " + " + ba + " = 99)");
				}
			}
		}
	}
}