package Assign2;
import java.util.Scanner;
public class UPPERCASE
{
	    public static void main(String args[])
	    {
	        char ch;
	        System.out.println("Enter The character you wish : ");
	        Scanner sc = new Scanner(System.in);
	        ch=sc.next().charAt(0);
	     
	  if(ch>=65 && ch<=90)
	        {
	            System.out.println("Entered character is Uppercase");
	        }
	    
	     else if(ch>=97 && ch<=122)
	{
	   System.out.println("Entered Character is Lowercase");
	}
	    }
	}
	 