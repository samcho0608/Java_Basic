package accessModifier;
import java.util.Scanner;

class TV {
	private boolean power = false;
	private boolean muted = false;
	private int ch, vl;
	
	
	TV(){
		this.ch = 8;
		this.vl = 20;
	}
	
	void OnOff() { power = !power; }
	
	void upCh() { if(power) ch += 1; }
	
	void upVl() { if(power) vl +=1; }
	
	void downCh() { if(power) ch -= 1; }
	
	void downVl() { if(power) vl -=1; }
	
	void mute() {
		muted = !muted;	
	}
	
	void selectCh(int ch) {
		if(power)
			this.ch = ch;
	}
	
	void showTV() {
		if(!power) {
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.println("│                           │");
			System.out.println("│                           │");
			System.out.println("│         Power Off         │");
			System.out.println("│                           │");
			System.out.println("│                           │");
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");
		}
		else {
			System.out.println("┌───────────────────────────┐");
			System.out.println("│                           │");
			System.out.printf("│          ch: %2d           │\n", ch);
			System.out.println("│                           │");
			System.out.println("│                           │");
			System.out.println("│                           │");
			System.out.printf("│          vl: %2d           │\n", muted ? 0 : vl);
			System.out.println("│                           │");
			System.out.println("└───────────────────────────┘");			
		}
	}
}

class Remote {
	private TV t1 = new TV();
	
	String menu() {
		Scanner sc = new Scanner(System.in);
		String input;
		System.out.println("┌───────────────────┐");
		System.out.println("│ ┌────┐            │");
		System.out.println("│ │ ON │            │");
		System.out.println("│ └────┘            │");
		System.out.println("│   CH         VL   │");
		System.out.println("│ ┌────┐     ┌────┐ │");
		System.out.println("│ │ UP │     │ UP │ │");
		System.out.println("│ └────┘     └────┘ │");
		System.out.println("│ ┌────┐     ┌────┐ │");
		System.out.println("│ │ DN │     │ DN │ │");
		System.out.println("│ └────┘     └────┘ │");
		System.out.println("│                   │");
		System.out.println("│                   │");
		System.out.println("│                   │");
		System.out.println("└───────────────────┘");
		
		input = sc.next();
		return input;
	}
	
	void work(){
		String input;
		while(true) {
			input = menu();
			
		}
	}
}

public class Quiz1 {

	public static void main(String[] args) {
		TV t1 = new TV();
		// 처음 채널은 8, 볼륨은 20
		
		t1.OnOff();
		t1.showTV();
		
		t1.upCh();
		t1.upVl();
		t1.showTV();
		
		t1.downCh();
		t1.downVl();
		t1.showTV();
		
		t1.OnOff();
		t1.showTV();
		
		t1.OnOff();
		t1.mute();
		t1.showTV();
		
		t1.mute();
		t1.showTV();
	}

}
