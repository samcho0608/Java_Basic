package _interface;

public class Ex04 {

	public static void main(String[] args) {
		Slash sl = new Slash() {
			
			@Override
			public void slash(String weapon) {
				System.out.println(weapon + "로 베다.");
			}
		};

		sl.slash("칼");
		
		// lambda function: instance creatable only with functin interface
		Slash sl2 = (String weapon) -> {
			//		(argument) -> { 실행 코드;}
			System.out.println(weapon + "로 베다.");
		};
		
		sl2.slash("도끼");
	}

}
