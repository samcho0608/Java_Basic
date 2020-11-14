package _interface;

interface USB {	// used to give a class a certain characteristic
	// variables within an interface attains
	// public static final characteristic
	String type = "CŸ��";
	
	// methods within an interface attains
	// public abstract characteristic
	void connect();
}

class ElectricFan implements USB{
	ElectricFan(){
		
	}
	
	@Override
	public void connect() {
		System.out.println("��ǳ�� ����, ���� ����");
	}
}

class SmartPhone implements USB{
	@Override
	public void connect() {
		System.out.println("iPhone ����, 64GB, ����ƪ�� ����!");	
	}
}

class FlashMemory implements USB{
	@Override
	public void connect() {
		System.out.println("USB �޸� ����, Ž���� G:\\ ����");
	}
}

class PC {
	void usbRun(USB target) {
		target.connect();
	}
}

class Calculator {} // electronic device with an USB port

public class Ex02 {

	public static void main(String[] args) {
		ElectricFan fan = new ElectricFan();
		SmartPhone phone = new SmartPhone();
		FlashMemory memory = new FlashMemory();
		Calculator cal = new Calculator();
		
		PC pc = new PC();
		
		pc.usbRun(fan);
		pc.usbRun(phone);
		pc.usbRun(memory);
//		pc.usbRun(cal);
//		��> Calculator doesn't have the USB interface(or characteristic)
		
		System.out.print("��ǳ�� ��Ʈ Ÿ��: ");
		System.out.println(fan.type);
		
//		fan.type = "BŸ��";
//		��> interface member attains final characteristic
		
		
	}

}