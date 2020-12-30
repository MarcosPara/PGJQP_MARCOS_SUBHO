package Assign4;
import java.util.Scanner;
class palindrome
{
public static void main(String[] args)
{
int rev=0;
int n,rem,num;
System.out.println("Enter a Positive Number");
Scanner sc =new Scanner(System.in);
num=sc.nextInt();
n=num;
do
{
   rem=num%10;
   rev=rev*10+rem;
   num=num/10;
}while(num!=0);
System.out.println("The Reverse of a number is:"+rev);
  if (n == rev)
          {
           System.out.print("The number is a palindrome.");
          }
         else
            {
             System.out.print("The number is not a palindrome.");
            }
}
}