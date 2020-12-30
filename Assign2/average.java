package Assign2;
import java.util.Scanner;
class average
{
    public static void main(String args[])
    {
        int num1,num2,num3,num4,num5,avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number : ");
        num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = sc.nextInt();
        System.out.println("Enter Third Number : ");
        num3 = sc.nextInt();	
        System.out.println("Enter Fourth Number : ");
        num4 = sc.nextInt();
        System.out.println("Enter fifth Number : ");
        num5 = sc.nextInt();
       avg=(num1+num2+num3+num4+num5)/5;
       if(avg>10)
   {
System.out.println("is greater than 10");
   } 	
else
{
System.out.println("is not greater than 10");	
}

    }
}
 
