package casting2;

class Airplane {
	Person[] member = new Person[4];
	
	void takeOn(Person target) {
		for(int i = 0; i < member.length; i++)
			if(member[i] == null) {
				member[i] = target;
				System.out.println(target.getName() + "님이 탑승!");
				return;
			}
		System.out.println("좌석이 꽉 참");
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
		System.out.println("기내에 의사가 없습니다.");
	}
}

public class Main{
	public static void main(String[] args) {
		Airplane airBusan = new Airplane();
		
		Student s1 = new Student("홍길동", 14, "학생");
		Police p1 = new Police("마동석", 39, "경찰");
		Musician m1 = new Musician("블랙핑크", 20, "연예인");
		Doctor d1 = new Doctor("이국종", 40, "의사");
		Gamer g1 = new Gamer("페이커", 21, "프로게이머");
		
		airBusan.takeOn(s1);
		airBusan.takeOn(p1);
//		airBusan.takeOn(m1);
//		airBusan.takeOn(d1);
//		airBusan.takeOn(g1);
		
		airBusan.showPerson();
		airBusan.emergency();
		
	}
}