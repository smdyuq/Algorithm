import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int a, b, c;

//		백의자리
		a = num2 / 100;
		a %= 100;

//		십의자리
		b = num2 / 10;
		b %= 10;

//		일의자리
		c = num2 % 10;

		int sum1 = num1 * c;
		int sum2 = num1 * b;
		int sum3 = num1 * a;
		int sum4 = num1 * num2;

		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
		System.out.println(sum4);

	}
}
