package Assign2;
import java.util.Scanner;
public class Div1
{
    public static void main(String args[])
    {
        int num;
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();	
if(num%9==0)
        {
            System.out.println("The Number is divisible by 9");
        }
      else
        {
            System.out.println("The Number is not divisible by 9");
        }
    }
}
 
