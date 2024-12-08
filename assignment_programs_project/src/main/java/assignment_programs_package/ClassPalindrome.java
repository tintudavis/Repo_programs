package assignment_programs_package;

public class ClassPalindrome
{

	public static void check(boolean f,String s)
	{
		if(f==true)
		{
			System.out.println(s +" is Palindrome");
		}
		else
			System.out.println(s+" is not palindrome");
	}
	public static void main(String[] args)
	{  
        String s1="Java",s2="malayalam"; 
        boolean f;
        f= Palindromecheck(s1); 
        check(f,s1);
        f= Palindromecheck(s2);
        check(f,s2);
    }  
    private static boolean Palindromecheck(String string)
    {  
        String reversed = new StringBuilder(string).reverse().toString();  
        return string.equals(reversed);  
    }  
}
