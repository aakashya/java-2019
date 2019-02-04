import java.util.*;
import java.io.*;
class Student{
	public static void main(String[] args) {
		try{
			File f = new File("data.txt");
			FileWriter fout = new FileWriter(f);
			BufferedWriter bout = new BufferedWriter(fout);
			Scanner sc = new Scanner(System.in);
			boolean flag= true;
			while(flag){
				System.out.println("enter S. no:");
				bout.write(Integer.toString(sc.nextInt()));
				bout.write(' ');
				System.out.println("enter name:");
				bout.write(sc.next());
				bout.write(' ');
System.out.println("enter CGPA:");
bout.write(Float.toString(sc.nextFloat()));
bout.write(' ');
System.out.println("enter grade: (A/B/C/D):");
bout.write(sc.next().charAt(0));
bout.newLine();
System.out.println("\n do you want to continue entering data Y/N");
char c = sc.next().charAt(0);
if(c=='n' || c=='N'){
	flag=false;
}

}bout.close();

FileReader fin = new FileReader(f);
FufferedReader bin= new BufferedReader(fin);
String sr;
System.out,println("The contents of the file are:\n");
while((sr=bin.readline()))

		}catch(Exception e)
		{
			System.out.println(e);
		}

	}
}