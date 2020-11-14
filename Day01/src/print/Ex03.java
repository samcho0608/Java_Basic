package print;

// The name of the .java file and
// the name of the class must be the same
// This is because jdk distinguishes .java files based on the class names

public class Ex03 {

	public static void main(String[] args) {
		// format characters:
		// %c: char
		// %s: string
		// %d: decimal
		// %u: unsigned integer
		// %f: float
		System.out.printf("%.2f", 3.14);
		// %.nf: n 자리만큼 소수점 제한
		
		
		System.out.printf("%d%f%s", 1,2.0,"Do you even miss me\n");
		System.out.printf("For %cll that time I spent here in %s\n", 'a', "Korea");
		System.out.printf("Never once did I not %s you\n","long for");
		System.out.printf("When will you talk to me %s", "again");
	}

}
