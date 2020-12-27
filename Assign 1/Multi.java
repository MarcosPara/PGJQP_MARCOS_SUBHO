import java.util.Scanner; 
class Multiply 
{
 public static void main(String[] args) 
{
        
        int num1, num2,num3,mul;
        System.out.println("Enter First Number: ");
        Scanner sc = new Scanner(System.in);
        num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = sc.nextInt();
        System.out.println("Enter Third Number: ");
        num3 = sc.nextInt();
        mul = num1*num2*num3;
        System.out.println("Multiplication of these numbers: "+mul);
    }
}
