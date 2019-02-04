import java.util.*;
public class Array
{
public static void main(String args[])
{
	int selement;
	int flag = -1;
	int counter = 0;
	Scanner scan = new Scanner(System.in);

	int elements[] = new int[10];
	System.out.println("Enter 10 Elements in the array:");
	for(counter = 0; counter < 10; counter++)
	{
		elements[counter] = scan.nextInt();
	}
	System.out.println("Enter the Element you want to find:");
	selement = scan.nextInt();

	System.out.println("The following elemtns were entered int the arrays:");
	for (counter = 0; counter < 10; counter++)

	{
		if(elements[counter] == selement)
		{
			flag =1;
			break;
		}
		else
		{
			flag = -1;
		}
	}
	if(flag ==1)
		{
			System.out.println("Element" +elements[counter]+"Found at position" + (counter + 1));
		}
		else 
		{
			System.out.println("Element not found" + flag);
	}}

}