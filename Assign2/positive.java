package Assign2;
import java.util.Scanner;
public class positive
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter The Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
if(num>0)
        {
            System.out.println("The Number is Positive");
        }
      else if(num<0)
        {
            System.out.println("The Number is Negative");
        }
else
{
   System.out.println("The Number is Zero");
}
    }
}
 
