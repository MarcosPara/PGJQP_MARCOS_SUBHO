import java.util.Scanner;
class multiply
{
public static void main(String[] args)
{

float num1, num2,mul;
System.out.println("Enter First Number: ");
Scanner sc = new Scanner(System.in);
num1 = sc.nextFloat();
System.out.println("Enter Second Number: ");
num2 = sc.nextFloat();
mul = num1*num2;
System.out.println("Multiplication of these numbers: "+mul);
}
}
