package Assign4;
import java.util.Scanner;
class fabio
{
   public static void main(String args[])
{
      int n,t1=0,t2=1,nextTerm=0;
      System.out.println("Enter the number:");
      Scanner sc = new Scanner(System.in);
      n = sc.nextInt();
      System.out.println("Fibonacci Series:");
     for(int i=1; i<=n; ++i)
      {
        if(i==1)
{
System.out.println(" "+t1);
continue;
}
if(i==2)
{
System.out.println(" "+t2);
continue;
}

    nextTerm=t1+t2;
    t1=t2;
    t2=nextTerm;
System.out.println(" "+nextTerm);
}
   }
  
   }
