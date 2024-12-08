package assignment_programs_package;

public class Salary_child1 extends Salary_Parent 
{
	public double hra,pf;
	public void calculate(double basic)
	{
		hra=basic*0.05;
		pf=basic*.20;
	}
}
