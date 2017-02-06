import java.util.Scanner;
public class Zodiac{
public static void main(String[] args){
	int month,day,choice;
	Scanner scan = new Scanner(System.in);
	System.out.println("**********ZODIAC SIGNS**********");
		do
		{
			System.out.println("Enter your birth month (1-12): ");
			month = scan.nextInt();
			System.out.println("Enter your birth day (1-31): ");
			day = scan.nextInt();
			if((month == 12 && day >=22 && day <=31)||
			(month == 1 && day >=1 && day <=19))
			System.out.print("You are Capricon. You are practical and prudent.");
			else if((month == 1 && day >=20 && day <=31)||
			(month == 2 && day >=1 && day <=17))
			System.out.print("You are Aquarius. You are friendly and honest.");
			else if((month == 2 && day >=18 && day <=29)||
			(month == 3 && day >=1 && day <=19))
			System.out.print("You are Pisces. You are immaginative and sensitive.");
			 else if ((month ==  3 && day >= 20 && day <= 31) || (month ==  4 && day >= 1 && day <= 19))
            		System.out.println("You are Aries. You are adventurous and energetic.");
            		else System.out.println("Wrong date!");
            		     System.out.println("\n======================================================\n");
            		     System.out.print("Try again? Press 1");
            		     choice = scan.nextInt();
            		     System.out.println("\n======================================================\n");
            	}while(choice==1);
            }
}
