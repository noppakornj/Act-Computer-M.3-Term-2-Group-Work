import java.util.Scanner;
public class Zodiac{
public static void main(String[] args){
	int month, day, choice;
	Scanner scan = new Scanner(System.in);
	System.out.println("**********ZODIAC SIGNS**********");
		do
		{
			System.out.println("Enter your birth month (1-12): ");
			month = scan.nextInt();
			System.out.println("Enter your birth day (1-31): ");
			month = scan.nextInt();
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
        		else if ((month ==  4 && day >= 20 && day <= 30) || (month ==  5 && day >= 1 && day <= 20))
            		System.out.println("Taurus");
        		else if ((month ==  5 && day >= 21 && day <= 31) || (month ==  6 && day >= 1 && day <= 20))
           	 	System.out.println("Gemini");
        		else if ((month ==  6 && day >= 21 && day <= 30) || (month ==  7 && day >= 1 && day <= 22))
            		System.out.println("Cancer");
        		else if ((month ==  7 && day >= 23 && day <= 31) || (month ==  8 && day >= 1 && day <= 22))
            		System.out.println("Leo");
        		else if ((month ==  8 && day >= 23 && day <= 31) || (month ==  9 && day >= 1 && day <= 22))
            		System.out.println("Virgo");
        		else if ((month ==  9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22))
            		System.out.println("Libra");
        		else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21))
            		System.out.println("Scorpio");
        		else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21))
           		 System.out.println("Sagittarius");
