import java.util.Scanner;

public class IT26100283Lab7Q1B{
	public static void main(String[] args) {
		
		int marks_1; 
		int marks_2; 
		int marks_3; 
		int marks_4;
		int no_of_stu;
		int count = 1;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students : ");
		no_of_stu = input.nextInt();
		System.out.println("");
		
		while (count <= no_of_stu) {
			System.out.println("Student "+count);
			System.out.print("Enter marks: ");
			
			marks_1 = input.nextInt();
			if (marks_1<0 | marks_1>100) {
			System.out.println("Invalid marks");
			return;
		}
			marks_2 = input.nextInt();
			if (marks_2<0 | marks_2>100) {
			System.out.println("Invalid marks");
			return;
		}
			marks_3 = input.nextInt();
			if (marks_3<0 | marks_3>100) {
			System.out.println("Invalid marks");
			return;
		}
			marks_4 = input.nextInt();
			if (marks_4<0 | marks_4>100) {
			System.out.println("Invalid marks");
			return;
		}
			
		double average = (marks_1+marks_2+marks_3+marks_4)/4;
		System.out.println("Average is : "+average);
		if (average <= 100.0 && average >= 75.0)
		{
			System.out.println("Overall Grade is : Distinction");
		}
		else if (average <= 74.0 && average >= 50.0)
		{
			System.out.println("Overall Grade is : Credit");
		}
		else if (average <= 49.0 && average >= 0.0)
		{
			System.out.println("Overall Grade is : Fail");
		}
			System.out.println("");
			count = count + 1;
		}
	}
}