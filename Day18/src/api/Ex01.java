package api;

class Test{
	
}

interface Test2{
	void func();
}

public class Ex01 {

	public static void main(String[] args) {
		System.out.println();
		
		Test test = new Test();
		
//		Class 클래스는 객체의 클래스를 정보를 얻어오기 위해 많이 사용
		Class cl = test.getClass();
		
		System.out.println(cl);
		System.out.println(cl.getName());
		
		System.out.println(test.getClass());
		System.out.println(test.getClass().getName());
		
		System.out.println(cl.getSimpleName());
		
		System.out.println(System.out.getClass().getName());
		
		System.out.println(new Thread().getClass().getName());
		
		Test2 test2 = new Test2() {
			@Override
			public void func() {
				System.out.println("익명 클래스");
			};
		};
		
		System.out.println(test2.getClass().getName());
	}

}
