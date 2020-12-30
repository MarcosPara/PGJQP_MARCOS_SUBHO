package Assign2;
import java.util.Scanner;
public class inequality
{
    public static void main(String args[])
    {
        int num1,num2;
        System.out.println("Enter First Number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        num2=sc.nextInt();

if(num1!=num2)
        {
            System.out.println("The Number is not Equal");
        }
    
else
{
   System.out.println("The Number is Equal");
}
    }
}
 