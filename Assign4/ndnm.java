package Assign4;
import java.util.Scanner;
class ndnm
{
   public static void main(String args[])
{
      int num,temp;
      int count=0;
      System.out.println("Enter the number:");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();
      temp=num;
      while(temp!=0)
      {
        count++;
        temp/=10;
      }
      System.out.println("Total digits in: "+num+":"+count);
   }
  
   }

