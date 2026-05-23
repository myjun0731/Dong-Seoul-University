package Ch06;

public class BitSearch {
	public static void main(String[] args) {
		int num = 15678;

		System.out.print("3번째 비트: " + (((byte) num >> 2) & 1) + '\n');
		System.out.print("5번째 비트: " + (((byte) num >> 4) & 1));

		System.out.println("\n");

		System.out.print(num + ": ");
		for (int i = ((byte) num); i >= 0; i--) {
			System.out.print((((byte) num >> i) & 1));
		}
		System.out.println("\n");
	}
}
