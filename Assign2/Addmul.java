package Assign2;
import java.util.Scanner; 
class Addmul 
{
 public static void main(String[] args) 
{
        
        int num1,num2,sum,mul;
        System.out.println("Enter The First number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter The Second Number: ");
        Scanner sb = new Scanner(System.in);
        num2 = sb.nextInt();
        sum = num1+num2;
        mul=num1*num2;
   if(sum>mul)
{
System.out.println("The Addition is Greater:"+ sum);
}
else
{
System.out.println("The Multiplication is Greater:"+ mul); 
}   
    }
}
