# TEST CASES
ScenarioA - Module 1: getCountryChoice()

White-box test cases:

Test for a valid country choice (e.g., input: 1, expected output: 1).
Test for the lower bound of the input range (e.g., input: 1, expected output: 1).
Test for the upper bound of the input range (e.g., input: 8, expected output: 8).
Test for an invalid input (e.g., input: 0, expected output: prompt for valid input).
Test for non-integer input (e.g., input: "abc", expected output: prompt for valid input).

Black-box test cases:

Test for the first country choice (e.g., input: 1, expected output: 1).
Test for the last country choice (e.g., input: 8, expected output: 8).
Test for a country choice in the middle of the range (e.g., input: 4, expected output: 4).
Test for an invalid country choice (e.g., input: 10, expected output: prompt for valid input).

Module: checkSeason()

White-box test cases:

Test for Australia (Meteorological) in different months (e.g., input: 1, expected output: "The current season in Australia (Meteorological) is Summer.").
Test for Australia (Noongar) in different months (e.g., input: 2, expected output: "The current season in Australia (Noongar) is Bunuru.").
Test for Japan in different months (e.g., input: 3, expected output: "The current season in Japan is Spring.").
Test for Spain in different months (e.g., input: 4, expected output: "The current season in Spain is Spring.").
Test for Mauritius in different months (e.g., input: 5, expected output: "The current season in Mauritius is Autumn.").
Test for Malaysia in different months (e.g., input: 6, expected output: "The current season in Malaysia is Southeast Monsoon.").
Test for Sri Lanka in different months (e.g., input: 7, expected output: "The current season in Sri Lanka is Southeast Monsoon.").
Test for an invalid country choice (e.g., input: 9, expected output: "Invalid country choice.").

Black-box test cases:

Test for the first month of each country (e.g., input: 1, expected output: "The current season in Australia (Meteorological) is Summer.").
Test for the last month of each country (e.g., input: 12, expected output: "The current season in Australia (Meteorological) is Summer.").
Test for an invalid month (e.g., input: 15, expected output: "Invalid month choice.").

ScenarioB

Module 1: User Input Validation

White Box Test Cases:

Test case for getValidCityChoice():

Input: scanner = [valid city choice]
Expected Output: [valid city choice]
Test case for getValidTimeChoice():

Input: scanner = [valid time choice]
Expected Output: [valid time choice]
Test case for getValidTemperature():

Input: scanner = [valid temperature]
Expected Output: [valid temperature]
Black Box Test Cases:

Test case for getValidCityChoice():

Input: scanner = [invalid city choice]
Expected Output: Error message and prompt for valid city choice
Test case for getValidTimeChoice():

Input: scanner = [invalid time choice]
Expected Output: Error message and prompt for valid time choice
Test case for getValidTemperature():

Input: scanner = [invalid temperature]
Expected Output: Error message and prompt for valid temperature

Module 2: Temperature Comparison and Calculation

White Box Test Cases:

Test case for getAverageTemperature():

Input: cityChoice = 1, timeChoice = 1
Expected Output: 18.2
Test case for getAverageTemperature():

Input: cityChoice = 2, timeChoice = 2
Expected Output: 21.0
Black Box Test Cases:

Test case for getAverageTemperature():

Input: cityChoice = 1, timeChoice = 2
Expected Output: 23.0
Test case for getAverageTemperature():

Input: cityChoice = 2, timeChoice = 1
Expected Output: 16.5