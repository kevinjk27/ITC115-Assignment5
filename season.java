/*
 * Kevin Kantono 02/09/2020
 * This method is asking the user to input 2 integers (a month and a day) and it will return the correct season. 
 * It has some error messages to let know the user when they inputted a wrong date format or when date doesn't exist.
 */

import java.util.*;

public class season {

	public static void main(String[] args) {
		System.out.println("What season are you on? ");
		ThisIsSeason();
	}

	public static void ThisIsSeason() {
		int maxMonth = 12;
		int maxDay = 31;
		int minMonthDay = 0;

		Scanner console = new Scanner(System.in);
		//asking the user to input the month and day
		System.out.print("Please input a month between 1 - 12: ");
		int month = console.nextInt();
		System.out.print("Please input a day between 1 - 31: ");
		int day = console.nextInt();
		
		//checking the user input for not exceeding the number of days and months
		if (month <= maxMonth && month > minMonthDay && day <= maxDay && day > minMonthDay) {
			
				//checking if the months and days are in SPRING!!
			if ((month == 3 && day >= 16 && day <= 31) || (month == 4 && day >= 1 && day <= 30)
					|| (month == 5 && day >= 1 && day <= 31) || (month == 6 && day >= 1 && day <= 15)) {
				System.out.print("The flowers are blooming in SPRING!");
				//making sure if the user inputs 4/31 it returns error message
			} else if (month == 4 && day == 31) {
				System.out.print("Date doesn't exist");
				
				
				//checking if the months and days are in SUMMER!!
			} else if ((month == 6 && day >= 16 && day <= 30) || (month == 7 && day >= 1 && day <= 31)
					|| (month == 8 && day >= 1 && day <= 31) || (month == 9 && day >= 1 && day <= 15)) {
				System.out.print("Put on your sunblock, it's SUMMER time!");
				//making sure if the user inputs 6/31 it returns error message	
			} else if (month == 6 && day == 31) {
				System.out.print("Date doesn't exist");
				
				
				//checking if the months and days are in FALL!!	
			} else if ((month == 9 && day >= 16 && day <= 30) || (month == 10 && day >= 1 && day <= 31)
					|| (month == 11 && day >= 1 && day <= 30) || (month == 12 && day >= 1 && day <= 15)) {
				System.out.print("FALL is pumpkin season!");
				//making sure if the user inputs 9/31 it returns error message
			} else if (month == 9 && day == 31) {
				System.out.print("Date doesn't exist");
				
				
				//checking if the months and days are in WINTER!!
			} else if ((month == 12 && day >= 16 && day <= 31) || (month == 1 && day >= 1 && day <= 31)
					|| (month == 2 && day >= 1 && day <= 29) || (month == 3 && day >= 1 && day <= 15)) {
				System.out.print("Brace your self, WINTER is coming!");
				//making sure if the user inputs 11/31, 2/30, 2/31 it returns error message
			} else if ((month == 11 && day == 31) || (month == 2 && day == 30) || (month == 2 && day == 31)) {
				System.out.print("Date doesn't exist");
			}

			//if user inputs any integer larger than number of days and months, it returns error message!
		} else {
			System.out.print("You entered out of range date and month");
		}

	}//end of ThisIsSeason()
}
