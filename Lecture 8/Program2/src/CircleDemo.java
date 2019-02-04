import java.util.*;
class CircleDemo
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the Radius:");
		double r = scan.nextDouble();
		ResizableCircle c = new ResizableCircle(r);
		System.out.println("Area: "+c.getArea()+"\nPerimeter: "+c.getPerimeter());
		System.out.println("Input resize percentage: ");
		int resize = scan.nextInt();
		c.radius = c.resize(resize);
		System.out.println("New Call Radius: "+c.radius+"\nArea: "+c.getArea()+"\nPerimeter: "+c.getPerimeter());
	}
}