package com.codingchamber;
import java.util.Scanner;

public class tempConvertFinal {
  
    // Create a scanner object for user input
    private static Scanner reader = new Scanner(System.in);

    // Method to ask for the temperature input from the user
    private static float askTemperature() {
        System.out.println("Please enter the temperature value");
        return reader.nextFloat();
    }

    // Method to ask for the unit of the temperature (Fahrenheit/Celsius)
    private static String askUnit() {
        while(true) {
            System.out.println("Please enter the unit of the temperature value, the choices are: F or C");
            String unit = reader.next();
            
            // Check if the input is valid (F or C), if not, ask again
            if(unit.equalsIgnoreCase("F") || unit.equalsIgnoreCase("C") ) {
                return unit;
            } else {
                System.out.println("INCORRECT, please enter again");
            }
        }
    }

    // Method to convert Celsius to Fahrenheit
    private static float convertToFahrenheit(float tempC) {
        return ((tempC / 5) * 9) + 32;
    }

    // Method to convert Fahrenheit to Celsius
    private static float convertToCelsius(float tempF) {
        return ((tempF - 32) * 5) / 9;
    }

    // Method to ask if the user wants to continue
    private static boolean askContinue() {
        System.out.println("Do you want to convert another temperature? Enter 'Y' for Yes, 'N' for No");
        String choice = reader.next();

        // Check if the user wants to continue (Y) or not (N)
        return choice.equalsIgnoreCase("Y");
    }
    
    public static void main(String[] args) {
      
        System.out.println("Hello, World!");

        // Loop to keep the program running as long as the user wants to convert temperatures
        do {
            float temp = askTemperature(); // Get temperature input
            String unit = askUnit();       // Get temperature unit input
            
            // Perform temperature conversion based on the selected unit
            switch(unit) {
                case "F":
                    float convertF = convertToCelsius(temp);
                    System.out.println("This temperature is " + convertF + " Celsius");
                    break;
                case "C":
                    float convertC = convertToFahrenheit(temp);
                    System.out.println("This temperature is " + convertC + " Fahrenheit");
                    break;
                case "f":
                    float convertFf = convertToCelsius(temp);
                    System.out.println("This temperature is " + convertFf + " Celsius");
                    break;
                case "c":
                    float convertCc = convertToFahrenheit(temp);
                    System.out.println("This temperature is " + convertCc + " Fahrenheit");
                    break;
                default:
                    System.out.println("Nothing has been chosen"); // Display message if an invalid unit is provided
            }
            
        } while(askContinue()); // Repeat the conversion if the user wants to continue

        // Close the scanner to release resources
        reader.close();
    }
}

