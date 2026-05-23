package Ch07;

public class SumTo100 {
	public static void main(String[] args) {
		int sum = 0;
		int count = 1;
		while (count < 100) {
			sum += count;
			count++;
		}
		System.out.println(sum);
	}
}