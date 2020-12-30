package Assign2;
import java.util.Scanner;
public class lower
{
    public static void main(String[] input)
    {
        char ch;
        int temp;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Enter a Character in Lowercase : ");
        ch = scan.next().charAt(0);
		
        temp = (int) ch;
        temp = temp - 32;
        ch = (char) temp;
		
      
if((ch>=65 && ch<=90))
{
System.out.println(ch + " is an Uppercase.");
}
else
{
System.out.println(ch + " is not an Uppercase.");
}
    }
}  
