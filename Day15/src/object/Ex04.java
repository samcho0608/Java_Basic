package object;

class Person {
	void sleep() { System.out.println("����� ���� �ܴ�");}
}

class Animal {
	void eat() { System.out.println("������ ���� �Դ´�");}
}

class Po {
	void show() {System.out.println("��ǥ�� (1,3)�Դϴ�.");}
}

public class Ex04 {

	public static void main(String[] args) {
		 Object[] member = new Object[] {
				 new Person(),
				 new Animal(),
				 new Po()
		 };
		 
		 for(int i = 0; i < member.length; i++) {
			 if(member[i] instanceof Person)
				 ((Person)member[i]).sleep();
			 else if(member[i] instanceof Animal)
				 ((Animal)member[i]).eat();
			 else if(member[i] instanceof Po)
				 ((Po)member[i]).show();
		 }
	}

}
