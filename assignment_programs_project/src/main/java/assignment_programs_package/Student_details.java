package assignment_programs_package;

public class Student_details 
{
	int id;
	String name;
	Address adr;

	public Student_details(int id,String name,Address adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	public void displayemp()
	{
		System.out.println("Student details");
		System.out.println("ID: "+id +"  Name: "+ name);
		System.out.println("Address");
		System.out.println(adr.street+" "+adr.state+" "+adr.country);
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Address a=new Address("aluva","Kerala","India");
		Student_details stud=new Student_details(1,"Tintu",a);
		stud.displayemp();
}
}