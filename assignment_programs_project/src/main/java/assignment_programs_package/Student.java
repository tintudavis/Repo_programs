package assignment_programs_package;

public class Student
{
	int m1,m2,m3;
	public Student(int m1,int m2,int m3)
	{
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
		System.out.println("Mark 1: "+m1);
		System.out.println("Mark 2: "+m2);
		System.out.println("Mark 3: "+m3);
	}

	public int calculate()
	{
		int mark=(m1+m2+m3)/3;
		
		return mark;
	}
	
	public static void grade(int marks)
	{
		if(marks>=80)
			System.out.println("Grade A");
		else if(marks>=60 && marks<80)
			System.out.println("Grade B");
		else
			System.out.println("Grade C");
	}
	
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Student 1 Marks");
		Student s=new Student(45,36,89);
		int marks=s.calculate();
		Student.grade(marks);
		System.out.println("Student 1 Marks");
		Student s1=new Student(80,86,89);
		marks=s1.calculate();
		Student.grade(marks);
		
	}

}
