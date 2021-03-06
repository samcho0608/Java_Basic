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
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("합계: " + sum);
		System.out.println("평균: " + avg);
	}

}
