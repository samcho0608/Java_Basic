package casting2;

class Airplane {
	Person[] member = new Person[4];
	
	void takeOn(Person target) {
		for(int i = 0; i < member.length; i++)
			if(member[i] == null) {
				member[i] = target;
				System.out.println(target.getName() + "���� ž��!");
				return;
			}
		System.out.println("�¼��� �� ��");
	}
	
	void showPerson() {
		for(int i = 0; i < member.length && member[i] != null; i++)
//			if(i != member.length - 1 && member[i] == null)
//				break;
//			else
			member[i].showInfo();
	}
	
	void emergency() {
		for(int i = 0; i < member.length; i++) {
			if(member[i] instanceof Doctor) {
				((Doctor)member[i]).cure();
				return;
			}
		}
		System.out.println("�⳻�� �ǻ簡 �����ϴ�.");
	}
}

public class Main{
	public static void main(String[] args) {
		Airplane airBusan = new Airplane();
		
		Student s1 = new Student("ȫ�浿", 14, "�л�");
		Police p1 = new Police("������", 39, "����");
		Musician m1 = new Musician("����ũ", 20, "������");
		Doctor d1 = new Doctor("�̱���", 40, "�ǻ�");
		Gamer g1 = new Gamer("����Ŀ", 21, "���ΰ��̸�");
		
		airBusan.takeOn(s1);
		airBusan.takeOn(p1);
//		airBusan.takeOn(m1);
//		airBusan.takeOn(d1);
//		airBusan.takeOn(g1);
		
		airBusan.showPerson();
		airBusan.emergency();
		
	}
}