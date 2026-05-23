package Ch07;

public class For1_9 {
	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 9; i++) {
				System.out.print(i + " X " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}