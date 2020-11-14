package casting;

class Doctor extends Person{
	Doctor (String name, int age){
		super(name, age);
	}
	
	void cure() {
		System.out.println("ġ�Ḧ �����մϴ�.");
	}
}

public class Ex03 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿", 15);
		Student s2 = new Student("��浿", 14, 70);
		Student s3 = new Student("�̱浿", 18, 75);
		Doctor d1 = new Doctor("�̱���", 40);

		Student[] stuMember = new Student[] { s2, s3 };	// p1 cannot be part of this
		
		Person[] member = new Person[] { p1, s2, s3, d1 }; // Person matrix can take all of the data types
		
		// get student out of member and call study()
		// get doctor out of member and call cure()
		for(int  i = 0; i < member.length; i++) {
			if(member[i] instanceof Student) {
				System.out.println("�л��� : " + member[i].name);
				((Student)member[i]).study();
				System.out.println();
			}
			else if(member[i] instanceof Doctor) {
				System.out.println("�ǻ�� : " + member[i].name);
				((Doctor)member[i]).cure();
				System.out.println();
			}
		}
		
	}

}
