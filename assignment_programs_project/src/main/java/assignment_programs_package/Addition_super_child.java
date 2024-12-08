package assignment_programs_package;

public class Addition_super_child extends Addition_super
{

	public void check() 
	{
		int sum=super.add(8, 20);
		
		if(sum%10==0)
		{
			System.out.println("Sum is divisible by 10");
		}
		else
		{
			System.out.println("Sum is not divisible by 10");
		}
		
	}
		public static void main(String[] args)
		{
		Addition_super_child obj=new Addition_super_child();
		obj.check();	
	}

}
