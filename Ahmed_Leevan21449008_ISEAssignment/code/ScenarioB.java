//FILE: ScenarioB.java
//AUTHOR: Mohamed Leevan Ahmed
//USERNAME: Leevan
//UNIT: ISAD1000
//PURPOSE:  
//REFERENCE: none
//COMMENTS: none
//REQUIRES: 
//LAST MOD: 30/05/2023

import java.util.*;

public class ScenarioB {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        int cityChoice;
        int timeChoice;
        double temperature;

        do 
        {
            cityChoice = getValidCityChoice(scanner);
        } while (cityChoice != 1 && cityChoice != 2);

        do 
        {
            timeChoice = getValidTimeChoice(scanner);
        } while (timeChoice != 1 && timeChoice != 2);

        temperature = getValidTemperature(scanner);

        double averageTemperature = getAverageTemperature(cityChoice, timeChoice);

        System.out.println("City choice: " + cityChoice);
        System.out.println("Time choice: " + timeChoice);
        System.out.println("Temperature: " + temperature);

        if (temperature > averageTemperature) 
        {
            System.out.println("The temperature is above the average temperature of the chosen city.");
        } 
        else if (temperature < averageTemperature) {
            System.out.println("The temperature is below the average temperature of the chosen city.");
        } 
        
        else 
        {
            System.out.println("The temperature is equal to the average temperature of the chosen city.");
        }

        double temperatureDifference = Math.abs(temperature - averageTemperature);
        if (temperatureDifference > 5) 
        {
            System.out.println("The temperature difference is more than 5 degrees Celsius.");
        }
    }

    public static void print(String message) 
    {
        System.out.println(message);
    }

    public static void disptime() 
    {
        String message = "\n\nPlease choose the current time." + "\n\n1. Morning (9AM)\n" + "2. Afternoon (3PM)\n";
        print(message);
    }

    public static void dispCity() 
    {
        String message = "\n\nPlease choose the city to check temperature." + "\n\n1. Perth\n" + "2. Adelaide\n";
        print(message);
    }

    public static void dispTemperature() 
    {
        String message = "\n\nPlease enter the temperature: ";
        print(message);
    }

    public static int getValidCityChoice(Scanner scanner) 
    {
        dispCity();
        int cityChoice;
        while (!scanner.hasNextInt()) 
        {
            scanner.next();
            System.out.println("Invalid input. Please enter a valid city choice.");
            dispCity();
        }
        cityChoice = scanner.nextInt();
        
        if (cityChoice != 1 && cityChoice != 2) 
        {
            System.out.println("Invalid input. Please enter a valid city choice.");
        }

        return cityChoice;
    }

    public static int getValidTimeChoice(Scanner scanner) 
    {
        disptime();
        int timeChoice;
        while (!scanner.hasNextInt()) 
        {
            scanner.next();
            System.out.println("Invalid input. Please enter a valid time choice.");
            disptime();
        }
        timeChoice = scanner.nextInt();
        if (timeChoice != 1 && timeChoice != 2) 
        {
            System.out.println("Invalid input. Please enter a valid time choice.");
        }

        return timeChoice;
    }

    public static double getValidTemperature(Scanner scanner) 
    {
        dispTemperature();
        double temperature;
        while (!scanner.hasNextDouble()) 
        {
            scanner.next();
            System.out.println("Invalid input. Please enter a valid temperature.");
            dispTemperature();
        }
        temperature = scanner.nextDouble();
        
        return temperature;
    }

    public static double getAverageTemperature(int cityChoice, int timeChoice) {
        double averageTemperature;
        if (cityChoice == 1) 
        {
            if (timeChoice == 1) 
            {
                averageTemperature = 18.2;
            } 
            else 
            {
                averageTemperature = 23.0;
            }
        } 
        else 
        {
            if (timeChoice == 1) 
            {
                averageTemperature = 16.5;
            } 
            else 
            {
                averageTemperature = 21.0;
            }
        }

        return averageTemperature;
    }
}

