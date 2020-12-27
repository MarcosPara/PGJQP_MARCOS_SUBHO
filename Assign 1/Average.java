import java.util.Scanner;
public class Average
{
public static void main(String[] args)
{

int num1, num2,num3,num4,num5,avg;
System.out.println("Enter First Number: ");
Scanner sc = new Scanner(System.in);
num1 = sc.nextInt();
System.out.println("Enter Second Number: ");
num2 = sc.nextInt();
System.out.println("Enter Third Number: ");
num3 = sc.nextInt();
System.out.println("Enter fourth Number: ");
num4 = sc.nextInt();
System.out.println("Enter fifth Number: ");
num5 = sc.nextInt();
avg = (num1+num2+num3+num4+num5)/5;
System.out.println("Average of these numbers: "+avg);
}
}
