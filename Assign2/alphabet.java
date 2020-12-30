package Assign2;
import java.util.Scanner;
public class alphabet
{
    public static void main(String args[])
    {
        char ch;
        System.out.println("Enter The character you wish : ");
        Scanner sc = new Scanner(System.in);
        ch=sc.next().charAt(0);
if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'))
        {
            System.out.println(ch + " is an alphabet");
        }
    
else
{
   System.out.println(ch + " is not an alphabet");
}
    }
}
 