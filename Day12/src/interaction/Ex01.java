package interaction;

class Minion {
	private String name= "�̴Ͼ�";
	private static int atk = 7;
	private int hp = 20;
	
	static int getAtk() {
		return atk;
	}

	Minion(String name){
		this.name = name;
	}
	
	static boolean atkUp() {
		if(atk < 10) {
			atk++;
			System.out.println("���� ���ݷ�: " + atk);
			return true;
		}
		else {
			System.out.println("�ִ�ġ(10)���� ����");
			return false;
		}
	}

	void showInfo() {
		System.out.println(name + "�� hp : " + hp + ", ��: " + atk);
	}
	
	void attack(Minion target) {
		target.hp -= atk;
		System.out.println(target.name+ "���� " + atk + "��ŭ ���ظ� �־���!");
		target.showInfo();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Minion[] minions = new Minion[3];
		for(int i = 0; i < minions.length; i++)
			minions[i] = new Minion("�̴Ͼ�" + i);
		minions[0].showInfo();
		minions[0].attack(minions[1]);
		
		System.out.println("\n���� �̴Ͼ���� ���ݷ�: " + Minion.getAtk());
		
		while(true)
			if(!Minion.atkUp())
				break;
		System.out.println("\n���� �̴Ͼ���� ���ݷ�: " + Minion.getAtk());
	}
	
}
