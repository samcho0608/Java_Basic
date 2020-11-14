package accessModifier;

import java.util.Scanner;

class Control{
	private TV tv;
	private Scanner sc = new Scanner(System.in);
	
	Control(){}
	
	Control(TV tv) { this.tv = tv;}
	
	void closeScanner() {
		sc.close();
	}
	
	public void setTv(TV tv) {
		this.tv = tv;
	}

	void run() {
		int menu;
		
		
		do {
			tv.showTV();
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
			System.out.println("1. ON");
			System.out.println("2. CH UP");
			System.out.println("3. CH DN");
			System.out.println("4. VL UP");
			System.out.println("5. VL DN");
			System.out.println("6. CH SLCT");
			System.out.println("7. MUTE");
			System.out.println("0. SHUT DOWN");
			System.out.print(">>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				tv.OnOff();
				break;
			case 2:
				tv.upCh();
				break;
			case 3:
				tv.downCh();
				break;
			case 4:
				tv.upVl();
				break;
			case 5:
				tv.downVl();
				break;
			case 6:
				int ch;
				System.out.print("시청할 채널: ");
				ch = sc.nextInt();
				tv.selectCh(ch);
				break;
			case 7:
				tv.mute();
				break;
			case 0:
				System.out.println("프로그램 종료");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
			if(menu != 0)
				for(int i = 0; i < 20; i++)
					System.out.println();
		}while(menu != 0);
		
		//sc.close();
	}
}

public class Quiz3 {

	public static void main(String[] args) {
		TV LG = new TV();
		
		Control remote = new Control(LG);
		
		remote.run();
		
		TV SAMSUNG = new TV();
		
		remote.setTv(SAMSUNG);
		
		remote.run();
		remote.closeScanner();
	}

}
