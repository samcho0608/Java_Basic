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
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("국어: ");
		kor = sc.nextInt();
		System.out.print("영어: ");
		eng = sc.nextInt();
		System.out.print("수학: ");
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
		System.out.println("=         리스트                    =");
		System.out.println("========================");
		for(Student s : members)
			System.out.println(s.getName());
	}
	
	void search(String target) {
		for(Student s : members) {
			if(s.getName().equals(target)) {
				System.out.println("해당 학생을 찾았습니다!\n");
				s.showInfo();
				return;
			}
		}
		System.out.println("해당 학생은 존재하지 않습니다!\n");
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
			System.out.println("파일을 찾을 수 없습니다.");
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
