package Assign2;
import java.util.Scanner;
class lesser
{
    public static void main(String args[])
    {
        int num1,num2,num3;
        System.out.println("Enter First Number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = sc.nextInt();
        System.out.println("Enter Third Number : ");
        num3 = sc.nextInt();	
if(num1<num2 && num1<num3)
        {
            System.out.println("The Number1 is lesser");
        }
      else if(num2<num1 && num2<num3)
        {
            System.out.println("The Number2 is lesser");
        }
else
{
   System.out.println("The Number3 is lesser");
}
    }
}
 

