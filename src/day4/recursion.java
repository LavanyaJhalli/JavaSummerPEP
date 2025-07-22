package day4;
import java.util.*;
public class recursion {
	static int fact(int n) {
		if(n==1) {
			return 1;
		}
		else {
			return n * fact(n - 1);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("------------FACTORIAL-----------");
		int a=sc.nextInt();
		System.out.println(fact(a));
	}
}
