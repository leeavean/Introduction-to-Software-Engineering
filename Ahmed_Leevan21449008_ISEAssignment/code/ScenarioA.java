//FILE: ScenarioA.java
//AUTHOR: Mohamed Leevan Ahmed
//USERNAME: Leevan
//UNIT: ISAD1000
//PURPOSE: 
//REFERENCE: none
//COMMENTS: none
//REQUIRES: 
//LAST MOD: 26/05/2023

import java.util.*;

public class ScenarioA 
{

    public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);

        while (true) {
            displayMainMenu();
            int countryChoice = getCountryChoice(sc);
            if (countryChoice == 8) {
                print("Exiting the program...");
                break; // End the loop and exit the program
            }

            dispMonth();
            int monthChoice = getMonthChoice(sc);
            if (monthChoice == 13) {
                continue; // Go back to the main menu
            }

            checkSeason(countryChoice, monthChoice);
        }

        sc.close(); // Close Scanner
    }

	//NAME: getCountryChoice
	//PURPOSE: Gets user input for selection of country
	//IMPORTS: 
	//EXPORTS: 
	//Assertions:
		//Pre: 
		//Post: 
	public static int getCountryChoice(Scanner sc) 
	{
		int Country = 0;
		boolean loop = true;

		while (loop) {
			try {
				Country = sc.nextInt();
				if (Country >= 1 && Country <= 8) {
					print("\nYou entered: " + Country);
					loop = false;
				} else {
					print("\nInvalid input given. Enter a number between 1 and 8 inclusive");
				}
			} catch (InputMismatchException error) {
				print("\nInvalid input given. Enter a number");
				sc.nextLine(); // clears invalid input
			}
		}

		return Country;
	}
		
	//NAME: getMonthChoice
	//PURPOSE: Gets user input for selection of month 
	//IMPORTS: Input, a Scanner object
	//EXPORTS: The month chosen by user
	//Assertions:
		//Pre: none
		//Post: Valid month chosen
	
		public static int getMonthChoice(Scanner sc) 
	{
		int month = 0;
		boolean repeat = true;

		while (repeat) {
			try {
				month = sc.nextInt();
				if (month >= 1 && month <= 13) {
					print("\nYou entered: " + month);
					repeat = false;
				} else {
					print("\nInvalid input given. Enter a number between 1 and 13 inclusive");
				}
			} catch (InputMismatchException error) {
				print("\nInvalid input given. Enter a number");
				sc.nextLine(); // clears invalid input
			}
		}

		return month;
	}

	//NAME: print
	//PURPOSE: prints a String to the console 
	//IMPORTS: message, the String to print
	//EXPORTS: none
	//Assertions:
		//Pre:msesage is given in string form
		//Post: message is displayed to console 
		public static void print(String message)
		{
			System.out.println(message);
		}
		
	//NAME: displayMainMenu
	//PURPOSE: 
	//IMPORTS: 
	//EXPORTS: none
	//Assertions:
		//Pre: 
		//Post: Main menu is displayed
		public static void displayMainMenu() 
		{
			String message = "\n\nPlease choose a Country from the options below." + "\n\n 1. Australia (Meteorological)\n" + " 2. Australia (Noongar)\n" + " 3. Japan\n" + " 4. Spain\n" + " 5. Mauritius\n" + " 6. Malaysia\n" + " 7. Sri Lanka\n" + " 8. Exit Program\n";
								print(message);
		}
		
		//NAME: dispMonth
		//PURPOSE: 
		//IMPORTS: 
		//EXPORTS: none
		//Assertions:
			//Post:  
			//Post: 
		public static void dispMonth() 
		{
			String message = "\n\nPlease choose a month to check the current season of the chosen country." + "\n\n1. January\n" + "2. February\n" + "3. March\n" + "4. April\n" + "5. May\n" + "6. June\n" + "7. July\n" + "8. August\n" + "9. September\n" + "10. October\n" + "11. November\n" + "12. December\n" + "13. Return to main menu\n";
	
			print(message);
		}	

		public static void checkSeason(int country, int month)
		{
			if (country == 1) // Australia (Meteorological)
			{
				if (month == 12 || month == 1 || month == 2)
					print("The current season in Australia (Meteorological) is Summer.");
				else if (month >= 3 && month <= 5)
					print("The current season in Australia (Meteorological) is autumn.");
				else if (month >= 6 && month <= 8)
					print("The current season in Australia (Meteorological) is Winter.");
				else if (month >= 9 && month <= 11)
					print("The current season in Australia (Meteorological) is Spring.");
				else
					print("Invalid month choice.");
			}
			else if (country == 2) // Australia (Noongar)
			{
				if (month == 12 || month == 1)
					print("The current season in Australia (Noongar) is Birak.");
				else if (month == 2 || month == 3)
					print("The current season in Australia (Noongar) is Bunuru.");
				else if (month == 4 || month == 5)
					print("The current season in Australia (Noongar) is Djeran.");
				else if (month == 6 && month == 7)
					print("The current season in Australia (Noongar) is Makuru.");
					else if (month == 8 && month == 9)
					print("The current season in Australia (Noongar) is Dijiba.");
					else if (month == 10 && month == 11)
					print("The current season in Australia (Noongar) is Kambarang.");
				else
					print("Invalid month choice.");
			}
			else if (country == 3) // Japan
			{
				if (month == 12 || month == 1 || month == 2)
					print("The current season in Japan is Winter.");
				else if (month >= 3 && month <= 5)
					print("The current season in Japan is Spring.");
				else if (month >= 6 && month <= 8)
					print("The current season in Japan is Summer.");
				else if (month >= 9 && month <= 11)
					print("The current season in Japan is Autumn.");
				else
					print("Invalid month choice.");
			}
			else if (country == 4) // Spain
			{
				if (month == 12 || month == 1 || month == 2)
					print("The current season in Spain is Winter.");
				else if (month >= 3 && month <= 5)
					print("The current season in Spain is Spring.");
				else if (month >= 6 && month <= 8)
					print("The current season in Spain is Summer.");
				else if (month >= 9 && month <= 11)
					print("The current season in Spain is Autumn.");
				else
					print("Invalid month choice.");
			}
			else if (country == 5) // Mauritius
			{
				if ((month >= 1 && month <= 4 ) || (month == 11 || month == 12))
					print("The current season in Mauritius is Summer.");
				else if (month == 5)
					print("The current season in Mauritius is Autumn.");
				else if (month >= 6 && month <= 9)
					print("The current season in Mauritius is Winter.");
				else if (month == 10)
					print("The current season in Mauritius is Spring.");
				else
					print("Invalid month choice.");
			}
			else if (country == 6) // Malaysia
			{
				if (month == 12 || month == 1 || month == 2)
					print("The current season in Malaysia is Northeast Monsoon.");
				else if (month == 3 || month == 4 || month == 10 || month == 11)
					print("The current season in Malaysia is Inter-monsoon.");
				else if (month == 5 || month == 9)
					print("The current season in Malaysia is Southeast Monsoon.");
				else
					print("Invalid month choice.");
			}
			else if (country == 7) // Sri Lanka
			{
				if (month == 12 || month == 1 || month == 2)
					print("The current season in Sri Lanka is Northeast Monsoon.");
				else if (month == 3 || month == 4 || month == 10 || month == 11)
					print("The current season in Sri Lanka is Inter-monsoon.");
				else if (month == 5 || month == 9)
					print("The current season in Sri Lanka is Southeast Monsoon.");
				else
					print("Invalid month choice.");
			}
			else
			{
				print("Invalid country choice.");
			}
		}		
}
