import java.util.Scanner; 
class Add 
{
public static void main(String[] args) 
{
int num1, num2, sum;
System.out.println("Enter First Number: ");
Scanner sc = new Scanner(System.in);
num1 = sc.nextInt();
System.out.println("Enter Second Number: ");
num2 = sc.nextInt();
sum = num1 + num2;
System.out.println("Sum of these numbers: "+sum);
    }
}
