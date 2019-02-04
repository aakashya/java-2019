import java.util.*;

class ExceptionHandling
{
	public static void setTitle(string title)
	{
		if (title = null){
			throw new IllegalArgumentException("");
		}
		System.out.println(title);}
		public static void main(String args[]){

		System.out.println("enter 1 for ArithmeticException \t2-  ArrayIndexOutOfBoundsException\t 3- NumberFormatException \t 4- NullPointerException \t 5-IllegalArgumentException");
		Scanner scan=new Scanner(System.in);
		ch=scan.nextInt();
		switch(ch)
		{
			case 1:
			try{
				num1=100;
				num2=0;
				int out=num1/num2;
				system.out.println("Result=out");
			}
			catch(ArithmeticException e){
			System.out.println ("You Should not divide a number by zero");
		}
		break;

		case 2:
		try{
			int a[]=new int[10];
			//Array has only 10 elements
			a[11] = 9;

		}
		catch(ArrayIndexOutOfBoundsException e){
			Syetem.out.println ("ArrayIndexOutOfBounds");
		}
		break;

		case 3:
		try{
			intnum=Integer.perseInt("XYZ");
			System.out.println(num);
		}
		catch(NumberFormatException e){
			System.out.println("Number format exeception occured");
		}
		break;

		case 4:
		try{
			String str=null;
			System.out.println (str.length());
		}
		catch(NullPointerException e){
			System.out.println("NullPointerException..");
		}
				break;
				case 5:
				try{
					String x=null;
					//Try to pass an int value.
					setTitle(x);
				}catch(IllegalArgumentException e){
					System.out.println("IllegalArgumentException..");
			}


}

	