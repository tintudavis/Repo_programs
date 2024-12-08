package assignment_programs_package;

public class Average 
{
	public void add(int a,int b,int c)
	{
		int avg=(a+b+c)/3;
		System.out.println("Average of 3 integer numbers is : " +avg);
	}
	
	public void add(float a,float b,float c)
	{
		float avg=(a+b+c)/3;
		System.out.println("Average of 3 float numbers is : " +avg);
	}

	public static void main(String[] args)
	{
		
		Average a1=new Average();
		a1.add(1, 2, 3);
		a1.add(1.5f, 2.5f, 3.5f);
		
	}

}
