package assignment_programs_package;

public class Reverse_number 
{
	int num;
	public Reverse_number()
	{	
		
		System.out.println("Finding reverse of a number");
	}
	
	
	public Reverse_number(int num)
	{
		this();
		this.num=num;
		int reverse = 0;  
		while(num != 0)   
		{  
		int remainder = num % 10;  
		reverse = reverse * 10 + remainder;  
		num = num/10;  
		}  
		System.out.println("The reverse of the given number is: " + reverse);  
	}
	public static void main(String[] args)
	{
		Reverse_number obj=new Reverse_number(123);
	}

}
