package Ch04;

public class Explicit_Conversion01 {
	public static void main(String[] args) {
		int i = 200;
		double d = 123.456;
		float f = (float) ((double) i + d);
		System.out.println("float 값 : " + f);
	}
}