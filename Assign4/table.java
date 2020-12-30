package Assign4;
import java.util.Scanner;
class table
{
public static void main(String[] args)
{
int counter,num;
System.out.println("Enter any number");
Scanner sc =new Scanner(System.in);
num=sc.nextInt();
for(counter=1;counter<=10;counter++)
{
System.out.println(" "+num+"*"+counter+"="+num*counter);
}
}
}