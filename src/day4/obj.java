package day4;
class Student{
	int id;
	String name;
}
public class obj {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.id=10;
		s1.name="John";
		System.out.println(s1.id+" "+s1.name);
	}
}
