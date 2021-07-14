import java.util.Scanner;

public class Zodiac {
	public static void main(String[] args) {
		int month, day, choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("**********ZODIAC SIGNS**********");
		do {
			System.out.print("Enter your birth month (1-12): ");
			month = scan.nextInt();
			System.out.print("Enter your birth day (1-31): ");
			day = scan.nextInt();
			if ((month == 12 && day >= 22 && day <= 31) || (month == 1 && day >= 1 && day <= 19)) {
				System.out.print("You are Capricorn. You are practical and prudent.");
			} else if ((month == 1 && day >= 20 && day <= 31) || (month == 2 && day >= 1 && day <= 17)) {
				System.out.print("You are Aquarius. You are friendly and honest.");
			} else if ((month == 2 && day >= 18 && day <= 29) || (month == 3 && day >= 1 && day <= 19)) {
				System.out.print("You are Pisces. You are imaginative and sensitive.");
			} else if ((month == 3 && day >= 20 && day <= 31) || (month == 4 && day >= 1 && day <= 19)) {
				System.out.println("You are Aries. You are adventurous and energetic.");
			} else if ((month == 4 && day >= 20 && day <= 30) || (month == 5 && day >= 1 && day <= 20)) {
				System.out.println("You are Taurus. You are patient and reliable.");
			} else if ((month == 5 && day >= 21 && day <= 31) || (month == 6 && day >= 1 && day <= 20)) {
				System.out.println("You are Gemini. You are adaptable and versitile.");
			} else if ((month == 6 && day >= 21 && day <= 30) || (month == 7 && day >= 1 && day <= 22)) {
				System.out.println("You are Cancer. You are emotional and loving.");
			} else if ((month == 7 && day >= 23 && day <= 31) || (month == 8 && day >= 1 && day <= 22)) {
				System.out.println("You are Leo. You are generous and warmhearted.");
			} else if ((month == 8 && day >= 23 && day <= 31) || (month == 9 && day >= 1 && day <= 22)) {
				System.out.println("You are Virgo. You are modest and shy.");
			} else if ((month == 9 && day >= 23 && day <= 30) || (month == 10 && day >= 1 && day <= 22)) {
				System.out.println("You are Libra. You are diplomatic and urbane.");
			} else if ((month == 10 && day >= 23 && day <= 31) || (month == 11 && day >= 1 && day <= 21)) {
				System.out.println("You are Scorpio. You are determined and forceful.");
			} else if ((month == 11 && day >= 22 && day <= 30) || (month == 12 && day >= 1 && day <= 21)) {
				System.out.println("You are Sagittarius. You are optimistic and freedom-loving.");
			} else {
				System.out.println("Wrong date!");
			}
			System.out.println("\n======================================================\n");
			System.out.print("Try again? Press 1: ");
			choice = scan.nextInt();
			System.out.println("\n======================================================\n");
		} while (choice == 1);
	}
}
