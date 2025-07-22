package day4;

class constructor{
	int id;
	String name;
	void display() {
		System.out.println(id+" "+name);
	}

public static void main(String[] args) {
	constructor c1=new constructor();
	constructor c2=new constructor();
	c1.display();
	c2.display();
	}
}