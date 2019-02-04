// Author : Abhishek 18CSU007
// Version : 1.0.0
// Purpose : Solve the Two Numbers Input in Addition, Subtraction, Multiplication & Division with Remainder


public class MathOperation
{
 
    public static void main(String[] args)
    {
        // the Value of the Two Integer Assign
        int number1 = 20;
        int number2 = 5;
 
        // Calculating number1 + number2;
        int sum = number1 + number2;
 
        // Calculating number1 - number2;
        int difference = number1 - number2;
 
        // Calculating number1 * number2;
        int product = number1 * number2;
 
        // Calculating number1 / number2;
        int quot = number1 / number2;
 
        // Calculating number1 % number2;
        int rem = number1 % number2;
 
        // 0Displaying the values of Each Seperatly (Addition, Subtraction, Multiplication, Division & Remainder)
        System.out.println("number1 : "+number1);
        System.out.println("number2 : "+number2);
        System.out.println("sum : "+sum);
        System.out.println("difference : "+difference);
        System.out.println("product : "+product);
        System.out.println("quot : "+quot);
        System.out.println("rem : "+rem);
    }
}