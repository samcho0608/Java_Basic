package _interface;

public class Ex04 {

	public static void main(String[] args) {
		Slash sl = new Slash() {
			
			@Override
			public void slash(String weapon) {
				System.out.println(weapon + "�� ����.");
			}
		};

		sl.slash("Į");
		
		// lambda function: instance creatable only with functin interface
		Slash sl2 = (String weapon) -> {
			//		(argument) -> { ���� �ڵ�;}
			System.out.println(weapon + "�� ����.");
		};
		
		sl2.slash("����");
	}

}