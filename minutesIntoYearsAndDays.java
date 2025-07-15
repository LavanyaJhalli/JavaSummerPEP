package day2;
import java.util.Scanner;
public class minutesIntoYearsAndDays {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of minutes");
		long min=sc.nextLong();
		long yr=60*24*365;
		long yrs=min/yr;
		long rem=min%yr;
		long days=rem/(60*24);
		System.out.println(min+" min is approx "+ yrs+ " years and "+ days +" days.");
		sc.close();
	}
}
    