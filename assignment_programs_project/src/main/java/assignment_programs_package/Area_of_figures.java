package assignment_programs_package;

public class Area_of_figures 
{
	
	public void area(int radius)
	{
		double a=3.14*(radius*radius);
		System.out.println("Area of circle is : "+a);
	}
	
	public void area(float length,float width)
	{
		double a=length*width;
		System.out.println("Area of rectangle is : "+a);
	}
	
	public void area(float side)
	{
		float a=side*side;
		System.out.println("Area of square is : "+a);
	}
	public static void main(String[] args)
	{
		Area_of_figures fig=new Area_of_figures();
		fig.area(2);
		fig.area(2, 8);
		fig.area(5f);
	}

}
