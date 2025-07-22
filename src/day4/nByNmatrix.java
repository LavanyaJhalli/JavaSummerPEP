package day4;
import java.util.*;
public class nByNmatrix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------N x N Matrix------------");
		System.out.print("Input a number: ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print((i+j)%2+" ");
			}
			System.out.println();
		}
	}
}
