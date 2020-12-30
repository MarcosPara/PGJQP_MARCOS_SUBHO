package Assign4;
import java.util.Scanner;
class armstrong
{
public static void main(String[] args)
{
int num,originalnum,remainder,result=0;
System.out.println("Enter a three digit number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
originalnum=num;
while(originalnum!=0)
{
remainder=originalnum % 10;
result+=remainder*remainder*remainder;
originalnum/=10;
}
if(result==num)
{
System.out.println("is an armstrong number:"+num);
}
else
{
System.out.println("is not an armstrong number:"+num);
}
}
}
