import java.util.Scanner;
class increment
{
static public void main(String[] args )
{
int num;
System.out.println("Enter a Number");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("Incremented Number is "+(num+1));
}
}