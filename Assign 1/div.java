import java.util.Scanner;
class div
{
public static void main(String[] args)
{
int num1, num2,quotient,remainder;
System.out.println("Enter First Number: ");
Scanner sc = new Scanner(System.in);
num1 = sc.nextInt();
System.out.println("Enter Second Number: ");
num2 = sc.nextInt();
quotient = num1/num2;
remainder= num1%num2;
System.out.println("Quoteint of these numbers: "+quotient);
System.out.println("Remainder of these numbers: "+remainder);
}
}
