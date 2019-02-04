// Author : Abhishek 18CSU007
// Version : 1.0.0
// Purpose : To Find the Input Character is vowel or Consonant.

import java.util.Scanner;
public class Vowels {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // In that Reason the User Input the Character to check whether the character is Vowel or Consonant00
        System.out.print("Input an alphabet: ");
        String input = in.next().toLowerCase();

        // Boolean use to State the Conditional Statement
        // uppercase ASCII Value A-Z = 66 to 90
        // Lowerclass ASCII Value a-z = 97 to 122
        // Vowels : a,e,i,o,u

        boolean uppercase = input.charAt(0) >= 65 && input.charAt(0) <= 90;
        boolean lowercase = input.charAt(0) >= 97 && input.charAt(0) <= 122;
        boolean vowels = input.equals("a") || input.equals("e") || input.equals("i")
                || input.equals("o") || input.equals("u");

        /* 1 will allow the loop to exit if a string of 0 length is input, meaning the next line
            swhere you reference character 0 will cause a crash. Try it with >1 , just press return with no input. */

        if (input.length() > 1)
        {
            System.out.println("Error. Not a single character.");
        }
        else if (!(uppercase || lowercase))
        {
            System.out.println("Error. Not a letter. Enter uppercase or lowercase letter.");
        }
        else if (vowels)
        {
            System.out.println("Input letter is Vowel");
        }
        else
        {
            System.out.println("Input letter is Consonant");
        }
    }
}