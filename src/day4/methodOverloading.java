package day4;

public class methodOverloading {
	
	public void sum(int a,int b, int c) {
		System.out.println(a+b+c);	
		}
	public void sum(int a, float b) {
		System.out.println(a+b);
	}
	
	public void sum(double e,float f) {
		System.out.println(e+f);
	}
	
	public static void main(String[] args) {
		methodOverloading obj=new methodOverloading();
		obj.sum(1,2,30);
		obj.sum(5,7);
		obj.sum(7.5, 8.5f);
	}
}
