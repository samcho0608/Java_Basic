package _interface;

interface Giveable{}

class Person implements Giveable{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	void give(Giveable target){
		if( target instanceof Person)
			System.out.println(name + "(��)�� " + ((Person)target).name + "���� ���ڸ� �ǳ��ִ�.");
		else if( target instanceof Dog)
			System.out.println(name + "(��)��  " + ((Dog)target).name + "���� ���̸� �����ִ�.");
	}
}

class Dog implements Giveable{
	String name;
	
	Dog(String name){
		this.name = name;
	}
}

public class Quiz {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		Person p2 = new Person("��浿");
		
		Dog dog = new Dog("������");
		
		p1.give(p2);	// ȫ�浿�� ��浿���� ������ �ִ�
		
		// �����ε��� �ƴ� �������̽��� �ϳ� �����Ͽ�
		// �Ʒ� �ڵ尡 ����ǵ��� �Ͽ���.
		
		p1.give(dog);
		
	}

}