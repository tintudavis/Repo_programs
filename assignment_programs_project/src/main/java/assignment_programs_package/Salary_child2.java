package assignment_programs_package;

public class Salary_child2 extends Salary_child1
{
	double sal;
	public void display()
	{
		sal=basic+hra+pf-ded+bonus;
		System.out.println("Salary slip");
		System.out.println("Basic pay= "+basic);
		System.out.println("Deductions= "+ded);
		System.out.println("HRA= "+hra);
		System.out.println("PF= "+pf);
		System.out.println("Bonus = "+bonus);
		System.out.println("Total Salary= "+sal);
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Salary_child2 obj=new Salary_child2();
		obj.getdetails(50000, 4000, 10000);
		obj.calculate(50000);
		obj.display();
	}

}
