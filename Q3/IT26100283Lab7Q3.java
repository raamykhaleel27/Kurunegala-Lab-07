import java.util.Scanner;

public class IT26100283Lab7Q3 {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int count = 1;
		System.out.print("Enter the number of customers : ");
		int no_of_cus = input.nextInt();
		System.out.println("");
		
		while (count <= no_of_cus) {
			System.out.println("Customer "+count);
			System.out.print("Enter total bill amount: ");
			double totbill = input.nextDouble();
			
			System.out.print("Enter mode of payment (C for cash, O for other): ") ;
			char paymode = input.next().charAt(0);
			
			char mode = paymode;
			
			switch (mode) {
    case 'c' | 'C':
        System.out.println("Discount is : "+totbill*5/100);
		System.out.println("Amount to be paid: "+totbill*95/100);
        break;
    case 'o' | 'O':
        System.out.println("No discount applicable");
		System.out.println("Amount to be paid: "+totbill);
        break;
    default:
        System.out.println("Invalid mode.");
			}
		
		System.out.println("");
		
		count = count + 1;
			

		}
	}
}


