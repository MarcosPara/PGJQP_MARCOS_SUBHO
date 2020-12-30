package Assign4;
import java.util.Scanner;
class factorialWR
{
public static void main(String[] args)
{
int num,result=1;
System.out.println("Enter a value of N:");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
while(num!=0)
{
result*=num;
num--;
}
System.out.println("Factorial of N is:"+result);
}
}