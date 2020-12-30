package Assign4;
import java.util.Scanner;
class sumdigit
{
   public static void main(String args[])
{
      int num,rem;
      int sum=0;
      System.out.println("Enter the number:");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
 
      while(num>0)
      {
        rem=num%10;
        sum=sum+rem;
        num=num/10;

      }
      System.out.println("Sum is: "+sum);
   }
  
   }
