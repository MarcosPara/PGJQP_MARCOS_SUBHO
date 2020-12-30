package Assign4;
import java.util.Scanner;
class sum10num
{
public static void main(String[] args)
{
int counter,sum=0;
System.out.println("Enter the first 10 natural numbers");
Scanner sc =new Scanner(System.in);
for(counter=1;counter<=10;counter++)
{
System.out.println(" "+counter);
sum=sum+counter;
}
System.out.println("The sum of first 10 natural numbers are:"+sum);
}
}