// Author : Aakash 18CSU001
// Version : 1.0.0
// Purpose : Write a program to add the Quadratic Equation.
//           Input Values to be given within the program.

import java.util.Scanner;
public class Quadratic { 

// 
  public static void main(String[] Strings) {

        // It is to Input From the User The three Numbers a,b,c.
        Scanner input = new Scanner(System.in);

            System.out.print("Input a: ");
            double a = input.nextDouble();
            System.out.print("Input b: ");
            double b = input.nextDouble();
            System.out.print("Input c: ");
            double c = input.nextDouble();

            // Method to Solve the Quadratic Roots i.e Discriminant D (bsquarea-4ac)
            double result = b * b - 4.0 * a * c;
            /* If value of resuly is greater than 0 the equation has 2 variable they are calculated and displayed.
            If Value of result is equal to 0 then the equation has single
            Else the quadratic equation has no real roots, suitable mess. */
            if (result > 0.0) {
                double r1 = (-b + Math.pow(result, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(result, 0.5)) / (2.0 * a);
                System.out.println("The roots are " + r1 + " and " + r2);
            } else if (result == 0.0) {
                double r1 = -b / (2.0 * a);
                System.out.println("The root is " + r1);
            } else {
                System.out.println("The equation has no real roots.");
            }

    }
}