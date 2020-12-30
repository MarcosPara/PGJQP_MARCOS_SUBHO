package Assign2;
import java.util.Scanner;
public class div
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();	
if(num%7==0)
        {
            System.out.println("The Number is divisible by 7");
        }
      else
        {
            System.out.println("The Number is not divisible by 7");
        }
    }
}
 
