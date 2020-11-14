package nestedClass;

@FunctionalInterface
interface USB{
	void run();	// automatically public abstract
}

public class Ex04 {

	public static void main(String[] args) {
//		USB usb = new USB(); // interface cannot create an instance bc it's a type of abstract class
		
		// anonymous class == 1È¸¿ë
		USB usb = new USB() {
			@Override
			public void run() {
				System.out.println("Anonymous USB class instance");
			}
		};
		
		usb.run();
		
		USB usb2 = () -> {
			System.out.println("Anonymous class instance can be created with lambda method");
		};
		
		usb2.run();
	}

}
