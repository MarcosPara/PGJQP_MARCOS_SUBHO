package Assign2;
import java.util.Scanner;
class swapp
{
    public static void main(String args[])
    {
        int num1,num2,temp;
        System.out.println("Enter First Number : ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        num2 = sc.nextInt();
	System.out.println("Before Swapping Numbers:"+num1+" "+num2);
        num1=num1*num2;
        num2=num1/num2;
        num1=num1/num2;
     	System.out.println("After Swapping Numbers:"+num1+" "+num2);
    }
}
 
