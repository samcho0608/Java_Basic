package last;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Control stuCon = new Control();
		
		int menu;
		
		do {
			System.out.println("=== 학생 관리 ===");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 목록");
			System.out.println("3. 학생 검색");
			System.out.println("4. 학생 삭제");
			System.out.println("5. 저장");
			System.out.println("6. 불러오기");
			System.out.println("0. 프로그램 종료");
			System.out.print(">>>");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1: // add
				stuCon.add();
				break;
			case 2:	// list
				stuCon.list();
				break;
			case 3:	// search
				System.out.print("이름: ");
				stuCon.search(sc.next());
				break;
			case 4:	// remove
				System.out.print("이름: ");
				System.out.println((stuCon.remove(sc.next())) ? "제거 완료!\n" : "해당 학생은 존재하지 않습니다!\n");
				break;
			case 5:
				stuCon.save();
				break;
			case 6:
				stuCon.load();
				break;
			case 0:
				System.out.println("프로그램 종료!");
				break;
			default:
				System.out.println("없는 번호입니다.");
			}
		}while(menu != 0);
		
		sc.close();
	}

}
