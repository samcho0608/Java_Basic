package interaction;

class Minion {
	private String name= "미니언";
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
			System.out.println("현재 공격력: " + atk);
			return true;
		}
		else {
			System.out.println("최대치(10)까지 제한");
			return false;
		}
	}

	void showInfo() {
		System.out.println(name + "의 hp : " + hp + ", 공: " + atk);
	}
	
	void attack(Minion target) {
		target.hp -= atk;
		System.out.println(target.name+ "에게 " + atk + "만큼 피해를 주었다!");
		target.showInfo();
	}
}

public class Ex01 {
	public static void main(String[] args) {
		Minion[] minions = new Minion[3];
		for(int i = 0; i < minions.length; i++)
			minions[i] = new Minion("미니언" + i);
		minions[0].showInfo();
		minions[0].attack(minions[1]);
		
		System.out.println("\n현재 미니언들의 공격력: " + Minion.getAtk());
		
		while(true)
			if(!Minion.atkUp())
				break;
		System.out.println("\n현재 미니언들의 공격력: " + Minion.getAtk());
	}
	
}
