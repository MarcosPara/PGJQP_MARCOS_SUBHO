package Assign4;
import java.util.Scanner;
class primerange
{
   public static void main(String args[])
{
      int low,high,i;
      boolean isPrime=true;
      System.out.println("Enter two numbers(intervals):");
      Scanner sc = new Scanner(System.in);
      low=sc.nextInt();
      high=sc.nextInt();
      System.out.println("Prime numbers between:"+low+"and"+high+"are:");
      while(low<high)
       {
       isPrime=true;
       if(low==0 ||low==1)
      {
        isPrime=false;
      }
     else
{
for(i=2; i<=low/2; ++i)
{
if(low%i==0)
{
isPrime=false;
break;
}
}
}
if(isPrime)
System.out.println(" "+low);
++low;
}
}
}
