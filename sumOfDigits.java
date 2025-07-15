package day2;
import java.util.Scanner;

public class sumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		int og=num;
		while(num!=0) {
			int digit=num%10;
			sum+=digit;
			num/=10;
		}
		System.out.println("Sum of digits of "+og+" is "+sum);
		sc.close();
	}
}
