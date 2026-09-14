import java.util.Scanner;

public class IT26100283Lab7Q1A{
	public static void main(String[] args) {
		
		int marks_1; 
		int marks_2; 
		int marks_3; 
		int marks_4;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter marks for four subjects:");
		System.out.print("Enter Subject Mark 1: ");
		marks_1 = input.nextInt();
		if (marks_1<0 | marks_1>100) {
			System.out.println("Invalid marks");
			return;
		}
		
		System.out.print("Enter Subject Mark 2: ");
		marks_2 = input.nextInt();
		if (marks_2<0 | marks_2>100) {
			System.out.println("Invalid marks");
			return;
		}
		
		System.out.print("Enter Subject Mark 3: ");
		marks_3 = input.nextInt();
		if (marks_3<0 | marks_3>100) {
			System.out.println("Invalid marks");
			return;
		}
		
		System.out.print("Enter Subject Mark 4: ");
		marks_4 = input.nextInt();
		if (marks_4<0 | marks_4>100) {
			System.out.println("Invalid marks");
			return;
		}
		
		double average = (marks_1+marks_2+marks_3+marks_4)/4;
		
		System.out.println("");
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
		
	}
}