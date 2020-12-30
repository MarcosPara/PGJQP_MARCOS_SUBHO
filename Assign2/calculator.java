package Assign2;
import java.util.Scanner;
class calculator
{
    public static void main(String args[])
    {
        int choice,num1,num2;
        System.out.print("Enter your choice, 1.Addition 2.Subtraction 3.Multiplication 4.Division : ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();
        System.out.print("Enter two numbers ");
        num1= sc.nextInt();
        num2= sc.nextInt();
switch(choice)
        {
            case 1: System.out.print(num1+num2);break;
            case 2: System.out.print(num1-num2);break;
            case 3: System.out.print(num1*num2);break;
            case 4: System.out.print(num1/num2);break;
    
        default: System.out.print("Invalid choice");

        }
}
}
