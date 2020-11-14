package last;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;
import java.util.Scanner;

public class Control { // class actually controlling student class
	private LinkedList<Student> members = new LinkedList<Student>();
	Scanner sc = new Scanner(System.in);
	
	void add() {
		String name;
		int kor, eng, mat;
		System.out.print("�̸�: ");
		name = sc.next();
		System.out.print("����: ");
		kor = sc.nextInt();
		System.out.print("����: ");
		eng = sc.nextInt();
		System.out.print("����: ");
		mat = sc.nextInt();
		
		members.add(new Student(name, kor, eng, mat));
	}

	boolean remove(String target) {
		for(Student s : members) {
			if(s.getName().equals(target)) {
				members.remove(s);
				return true;
			}
		}
		return false;
	}	
	
	void list() {
		System.out.println("========================");
		System.out.println("=         ����Ʈ                    =");
		System.out.println("========================");
		for(Student s : members)
			System.out.println(s.getName());
	}
	
	void search(String target) {
		for(Student s : members) {
			if(s.getName().equals(target)) {
				System.out.println("�ش� �л��� ã�ҽ��ϴ�!\n");
				s.showInfo();
				return;
			}
		}
		System.out.println("�ش� �л��� �������� �ʽ��ϴ�!\n");
	}
	
	void save() {
		try {
			OutputStream out = new FileOutputStream("save.txt");
			
			for(int i = 0; i < members.size(); i++) {
				Student s = members.get(i);
				
				String result = s.getName() + " " + s.getKor() + " " + s.getEng()
								+ " " + s.getMat() + " " + s.getSum() + " " + s.getAvg() + "\n";
				out.write(result.getBytes());
			}
			
			out.close();
		} catch (FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	void load() {
		File file = new File("save.txt");
		
		try {
			Scanner sc = new Scanner(file);
			String name;
			int kor, eng, mat, sum;
			double avg;
			
			while(sc.hasNext()) {
				name = sc.next();
				kor = sc.nextInt();
				eng = sc.nextInt();
				mat = sc.nextInt();
				sum = sc.nextInt();
				avg = sc.nextDouble();
				
				members.add(new Student(name, kor, eng, mat, sum, avg));
			}
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found!");
		}
		finally {
			sc.close();
		}
	}
}