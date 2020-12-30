package Assign2;
import java.util.Scanner; 
class greater100
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
if(sum>100)
{
System.out.println("is greater than 100");
}
else
{
System.out.println("is not greater than 100");
}
    }
}
