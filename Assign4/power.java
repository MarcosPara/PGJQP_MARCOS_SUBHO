package Assign4;
import java.util.Scanner;
class power
{
public static void main(String[] args)
{
int m=1,base,power;
System.out.println("Enter base and power");
Scanner sc=new Scanner(System.in);
base=sc.nextInt();
power=sc.nextInt();
System.out.println(+base+"^"+power);
while(power!=0)
{
m=m*base;
--power;
}
System.out.println("="+m);
}
}

