package day2;
import java.util.Scanner;
public class inchesToMeters {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("-------INCHES TO METERS---------");
		System.out.println("Enter number in inches: ");
		double num=sc.nextDouble();
		double cov=num*0.0254;
		
		System.out.println(num+" to meters is "+cov);
		sc.close();
	}
}
