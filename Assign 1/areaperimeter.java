import java.util.Scanner;
class areaperimeter
{
public static void main(String[] args)
{
int l,b,area,perimeter;
System.out.println("Enter The length: ");
Scanner sc = new Scanner(System.in);
l = sc.nextInt();
System.out.println("Enter The Breadth: ");
Scanner sb = new Scanner(System.in);
b = sb.nextInt();
area = l*b;
perimeter=2*(l+b);
System.out.println("Area of Rectangle is: "+area);
System.out.println("Perimeter of Rectangle is: "+perimeter);
}
}

