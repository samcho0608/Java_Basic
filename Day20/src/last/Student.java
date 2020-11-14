package last;

public class Student { // stores the student info
	private String name;
	private int kor, eng, mat, sum;
	private double avg;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		sum = kor + eng + mat;
		avg = sum * 100 / 3 / 100.;
	}
	
	Student(String name, int kor, int eng, int mat, int sum, double avg){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.sum = sum;
		this.avg = avg;
	}
	
	
	public String getName() {
		return name;
	}
	
	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMat() {
		return mat;
	}

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	void showInfo() {
		System.out.println("�̸�: " + name);
		System.out.println("����: " + kor);
		System.out.println("����: " + eng);
		System.out.println("����: " + mat);
		System.out.println("�հ�: " + sum);
		System.out.println("���: " + avg);
	}

}