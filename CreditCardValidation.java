/**

 * File: CreditCardValidation.java

 * Authors: Claire Apovo, Anja Balla

 * Date: 10/20/2022

 * Last modified on: 10/25/2022

 */

import java.util.Scanner;
import java.lang.*;

public class CreditCardValidation{
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please, enter your credit card number: ");
        String input = keyboard.nextLine();

        if (isNumeric(input) && isPositive(input) && appropriateLength(input) && appropriateBeginning(input)){
            System.out.println("Valid Credit Card"); 
        }
        else{
            System.out.println("Invalid Credit Card"); 
        }
    }
    
    //checks whether the user input is a number or a string
    public static boolean isNumeric (String input){
        try{ 
            Long.parseLong(input); // we use long because the numbers may be too big to be stored as integers
            return true;
        }
        catch(NumberFormatException exc){
            return false;
        }
    }

    //checks whether the user input is positive or negative
    public static boolean isPositive(String input){
        if(Long.parseLong(input) > 0)
            return true;
        else
            return false;
    }

    //checks whether the number has between 13 and 16 digits
    public static boolean appropriateLength(String input){
        if(input.length() >= 13 && input.length() <= 16)
            return true;
        else
            return false;
    }

    //checks whether the number starts with 4, 5, 6 or 37
    public static boolean appropriateBeginning(String input){
        if (input.charAt(0) == '4')
            return true;
        else if (input.charAt(0) == '5')
            return true;
        else if (input.charAt(0) == '6')
            return true;
        else if (input.charAt(0) == '3' && input.charAt(1) == '7')
            return true;
        else
            return false;
    }
}