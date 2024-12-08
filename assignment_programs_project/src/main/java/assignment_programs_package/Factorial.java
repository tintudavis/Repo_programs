package assignment_programs_package;

public class Factorial 
{

	public void display(int fact)
	{
		System.out.println("Factorial  is: "+fact); 
	}
	
	public void fact_calc(int num)
	{
		int i,fact=1;  
		  int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  
		 this.display(fact);
	}
	
	public static void main(String[] args)
	{
		  
		Factorial f=new Factorial();
		f.fact_calc(5);
	}

}
