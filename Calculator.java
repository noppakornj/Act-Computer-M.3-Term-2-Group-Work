import java.util.Scanner;
public class Calculator{
public static void main(String[] args){
	float a, b, result;
	char choice, ch;
	Scanner scan = new Scanner(System.in);
	do
	{
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("5. Exit");
		System.out.println("Enter your choice");
		choice = scan.next().charAt(0);
		switch(choice)
			{
			case '1':System.out.println("Enter the first number");
				a = scan.nextFloat();
				System.out.println("Enter the second number");
				b = scan.nextFloat();
				result = a + b;
				System.out.println("Result="+result);break;
			case '2':System.out.println("Enter the first number");
				a = scan.nextFloat();
				System.out.println("Enter the second number");
				b = scan.nextFloat();
				result = a - b;
				System.out.println("Result="+result);break;
			case '3':System.out.println("Enter the first number");
				a = scan.nextFloat();
				System.out.println("Enter the second number");
				b = scan.nextFloat();
				result = a * b;
				System.out.println("Result="+result);break;
			case '4':System.out.println("Enter the first number");
				a = scan.nextFloat();
				System.out.println("Enter the second number");
				b = scan.nextFloat();
				result = a / b;
				System.out.println("Result="+result);break;
			case '5':System.exit(0);break;
			default:System.out.println("Wrong Choice");break;
		}
		System.out.print("\n====================================================\n");
		}while(choice!=5);
	}
}
