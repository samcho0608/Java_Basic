package object;

class Person {
	void sleep() { System.out.println("사람은 잠을 잔다");}
}

class Animal {
	void eat() { System.out.println("동물이 밥을 먹는다");}
}

class Po {
	void show() {System.out.println("좌표는 (1,3)입니다.");}
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
