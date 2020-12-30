package Assign2;
import java.util.Scanner;
class polygon
{
    public static void main(String args[])
    {
        double a,b,c,s,radius,area;
        int ch;
        System.out.print("1.Area of Circle ");
        System.out.print("2.Area of Rectangle ");
        System.out.print("3.Area of Triangle ");
        System.out.print("Enter your choice");
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
     
switch(ch)
        {
            case 1:
{ 
System.out.print("Enter the Radius of Circle:");
radius=sc.nextFloat();
area=3.14159*radius*radius;
System.out.print("Area of Circle ="+area);
break;
}
            case 2: 
{
System.out.print("Enter the Length and Breadth of Rectangle:");
a=sc.nextFloat();
b=sc.nextFloat();
area=a*b;
System.out.print("Area of Rectangle ="+area);
break;
}
            case 3: 
{
System.out.print("Enter All Three Sides of Triangle");
a=sc.nextFloat();
b=sc.nextFloat();
c=sc.nextFloat();
s=sc.nextFloat();
s=(a+b+c)/2;
area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.print("Area Of Triangle="+area);
break;
}
           
    
        default: System.out.print("invalid choice Try Again....!!!");
        break;
        }
}
}
