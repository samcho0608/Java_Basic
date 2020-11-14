package classBasic;

class People{
	String name;
	int age;
	double height;
	
	// constructor
	People(){
		name = "Sam";
		age = 22;
		height = 168.8;
	}
	People(String n, int a, double h){
		name = n;
		age = a;
		height = h;
	}
	
	void showInfo() {
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("신장: " + height);	
	}
}


public class Ex02 {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.showInfo();
		
		System.out.println();
		
		People po1 = new People("홍길동", 17, 181.4);
		po1.showInfo();
		
		People po2 = new People();
		po2.showInfo();

	}

}
