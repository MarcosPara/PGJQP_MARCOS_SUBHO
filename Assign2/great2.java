package Assign2;
import java.util.Scanner;
class great2
{
    public static void main(String args[])
    {
        int num1,num2;
        System.out.println("Enter First Number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = sc.nextInt();	
if(num1>num2)
        {
            System.out.println("The Number1 is Greater");
        }
      else
        {
            System.out.println("The Number2 is Greater");
        }
    }
}
 