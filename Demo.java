import java.util.Arrays;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		System.out.println("Enter student name:");
		Scanner Info = new Scanner(System.in);
		String FirstName = Info.nextLine();
		System.out.println("Enter student ID");
		int FirstID = Info.nextInt();
		
		Student FirstStudent= new Student(FirstName, FirstID);
		
		System.out.println("Enter student name:");
		Scanner Info2 = new Scanner(System.in);
		String SecondName = Info2.nextLine();
		System.out.println("Enter student ID:");
		int SecondID = Info.nextInt();
		
		Student SecondStudent = new Student(SecondName, SecondID);
		
		System.out.println("Enter student name:");
		Scanner Info3 = new Scanner(System.in);
		String ThirdName = Info3.nextLine();
		System.out.println("Enter student ID:");
		int ThirdID = Info3.nextInt();
		
		Student ThirdStudent = new Student(ThirdName, ThirdID);
		
		Student[] ArrayStudent = {FirstStudent, SecondStudent, ThirdStudent};
		Arrays.sort(ArrayStudent);
		System.out.println("Sorted:");
		for(int i = 0; i<ArrayStudent.length ; i++){
			System.out.println(ArrayStudent[i].toString());
		}
	}

}
