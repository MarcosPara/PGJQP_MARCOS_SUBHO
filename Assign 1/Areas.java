import java.util.Scanner;
public class Areas
{
public static void main(String[] args)
{
int r;
double pi=3.14,area;
System.out.println("Enter The radius: ");
Scanner sc = new Scanner(System.in);
r = sc.nextInt();
area = pi*r*r;
System.out.println("Area of Circle is: "+area);
}
}
