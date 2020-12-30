package Assign2;
import java.util.Scanner;

public class upper
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Uppercase : ");
        ch = scan.next().charAt(0);
		
        temp = (int) ch;
        temp = temp + 32;
        ch = (char) temp;
		
      
if((ch>=97 && ch<=122))
{
System.out.println(ch + " is an Lowercase.");
}
else
{
System.out.println(ch + " is not an Lowercase.");
}
    }
}   