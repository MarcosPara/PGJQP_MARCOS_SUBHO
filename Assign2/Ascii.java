package Assign2;
import java.util.Scanner;
public class Ascii
{
    public static void main(String args[])
    {
        char ch;
        System.out.print("Enter a Character : ");
        Scanner sc = new Scanner(System.in);
        ch = sc.next().charAt(0);	
if((ch>=97 && ch<=122) || (ch>=65 && ch<=90))
        {
            System.out.println(ch + " is an alphabet.");
        }
      else
        {
            System.out.println(ch + " is not an alphabet.");
        }
    }
}
 