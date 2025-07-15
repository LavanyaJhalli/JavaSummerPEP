package day2;
import java.util.Scanner;

public class tempConversion {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float f=sc.nextFloat();
		float a=5.0f/9.0f;
		float cov=(f-32);
		float n=a*cov;
		System.out.printf("Temperature in Celsius: %.2f\n", n);

		sc.close();
	}
}
