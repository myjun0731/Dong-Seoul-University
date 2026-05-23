package Ch07;

public class PartialByTimes {
	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			for (int i = 2; i <= 8; i += 2) {
				System.out.print(i + " X " + j + " = " + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}