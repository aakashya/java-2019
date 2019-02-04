public class EmployeeTest

{

	public static void main(String[] args)

	{

		

		Employee emp1=new Employee();

		

		emp1.setFirstName("Abhishek");

		emp1.setLastName("Singh");

		emp1.setMonthlySalary(120000);

		System.out.println("Details of employee1 : ");

		System.out.println("First Name :"+emp1.getFirstName());

		System.out.println("Last Name :"+emp1.getLastName());

		System.out.println("Monthly Salary :"+emp1.getMonthlySalary());

		double yearlysalary=emp1.getMonthlySalary()*12;

		System.out.println("Yearly Salary:"+yearlysalary);

		double salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		

		Employee emp2=new Employee();

		emp2.setFirstName("Anuj");

		emp2.setLastName("Gupta");

		emp2.setMonthlySalary(70000);

		System.out.println("Details of employee2 : ");

		System.out.println("First Name :"+emp2.getFirstName());

		System.out.println("Last Name :"+emp2.getLastName());

		System.out.println("Monthly Salary :"+emp2.getMonthlySalary());

		yearlysalary=emp2.getMonthlySalary()*12;

		System.out.println("Yearly Salary:"+yearlysalary);

		salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));



		Employee emp3=new Employee();

		emp3.setFirstName("Aman");

		emp3.setLastName("Sharma");

		emp3.setMonthlySalary(50000);

		System.out.println("Details of employee3 : ");

		System.out.println("First Name :"+emp3.getFirstName());

		System.out.println("Last Name :"+emp3.getLastName());

		System.out.println("Monthly Salary :"+emp3.getMonthlySalary());

		yearlysalary=emp3.getMonthlySalary()*12;

		System.out.println("Yearly Salary:"+yearlysalary);

		salaryraise=yearlysalary*0.10;

		System.out.println("10 % raise on yearly salary:"+(yearlysalary+salaryraise));

		

		

	}

}