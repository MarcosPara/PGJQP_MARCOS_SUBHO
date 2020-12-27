import java.util.Scanner;
class integer
{
int number;
void getdata()
{
System.out.println("Enter any integer value:");
Scanner s = new Scanner(System.in);
number = s.nextInt();
}
void display()
{
System.out.println("The number : " + number);
}
public static void main(String[] args)
{
integer i = new integer();
i.getdata();
i.display();
}
}