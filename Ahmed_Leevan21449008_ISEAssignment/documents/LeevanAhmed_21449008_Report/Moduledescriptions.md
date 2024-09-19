# Module Descriptions
_ScenarioA
getCountryChoice(Scanner sc): This module takes user input for the selection of a country. It prompts the user to enter a number between 1 and 8 inclusive and validates the input. It returns the chosen country number.

getMonthChoice(Scanner sc): This module takes user input for the selection of a month. It prompts the user to enter a number between 1 and 13 inclusive and validates the input. It returns the chosen month number.

print(String message): This module prints the provided message to the console.

displayMainMenu(): This module displays the main menu options to the user, presenting a list of countries to choose from.

dispMonth(): This module displays the month menu options to the user, presenting a list of months to choose from.

checkSeason(int country, int month): This module checks the current season based on the selected country and month. It uses if-else statements to determine the appropriate season for each country and month combination and prints the result to the console.

Explanation:

The getCountryChoice and getMonthChoice modules are responsible for obtaining user input and validating it to ensure that the chosen country and month fall within the specified ranges.

The print module is a utility module used to display messages to the console.

The displayMainMenu module presents the user with a list of countries to choose from, allowing them to make a selection.

The dispMonth module displays a list of months to choose from, allowing the user to select a month for which they want to check the current season.

The checkSeason module determines the current season based on the chosen country and month. It uses if-else statements to map the country and month inputs to the corresponding seasons and prints the result to the console.

Assumptions:

The input for the country and month choices is expected to be an integer.
The program assumes that the user will enter valid input within the specified ranges.
The program assumes that the user will follow the instructions provided in the menus and input the corresponding numbers for the country and month selections.
The program assumes that the user wants to check the current season for a specific country and month combination.

_ScenarioB_
main method:

Purpose: The main entry point of the program.
Imports: None.
Exports: None.
Assertions:
Pre: None.
Post: The program is executed.
print method:

Purpose: Prints a message to the console.
Imports: message - The message to be printed.
Exports: None.
Assertions:
Pre: message is a valid string.
Post: The message is displayed on the console.
disptime method:

Purpose: Displays the time choices to the user.
Imports: None.
Exports: None.
Assertions:
Pre: None.
Post: The time choices are displayed to the user.
dispCity method:

Purpose: Displays the city choices to the user.
Imports: None.
Exports: None.
Assertions:
Pre: None.
Post: The city choices are displayed to the user.
dispTemperature method:

Purpose: Displays a prompt for the user to enter the temperature.
Imports: None.
Exports: None.
Assertions:
Pre: None.
Post: The temperature prompt is displayed to the user.
getValidCityChoice method:

Purpose: Gets a valid choice of city from the user.
Imports: scanner - A Scanner object for user input.
Exports: The valid city choice entered by the user.
Assertions:
Pre: scanner is a valid Scanner object.
Post: The user enters a valid city choice (1 or 2).
getValidTimeChoice method:

Purpose: Gets a valid choice of time from the user.
Imports: scanner - A Scanner object for user input.
Exports: The valid time choice entered by the user.
Assertions:
Pre: scanner is a valid Scanner object.
Post: The user enters a valid time choice (1 or 2).
getValidTemperature method:

Purpose: Gets a valid temperature value from the user.
Imports: scanner - A Scanner object for user input.
Exports: The valid temperature entered by the user.
Assertions:
Pre: scanner is a valid Scanner object.
Post: The user enters a valid temperature value.
getAverageTemperature method:

Purpose: Retrieves the average temperature based on the city and time choices.
Imports: cityChoice - The user's choice of city (1 or 2), timeChoice - The user's choice of time (1 or 2).
Exports: The average temperature corresponding to the city and time choices.
Assertions:
Pre: cityChoice is a valid city choice (1 or 2), timeChoice is a valid time choice (1 or 2).
Post: The average temperature for the chosen city and time is returned.