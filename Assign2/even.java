package Assign2;
import java.util.Scanner;
public class even
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();	
if(num%2==0)
        {
            System.out.println("The Number is Even");
        }
      else
        {
            System.out.println("The Number is Odd");
        }
    }
}
 

