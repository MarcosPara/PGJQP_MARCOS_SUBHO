import java.util.Scanner;
class Divison
{
int dividend, divisor, quo=0, rem=0;
void getdata()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the Dividend : ");
dividend = s.nextInt();
System.out.println("Enter the Divisor : ");
divisor = s.nextInt();
}

void divison()
{
quo = dividend / divisor;
rem = dividend % divisor;
}

void display()
{
System.out.println("Quotient : " + quo);
System.out.println("Remainnder : " + rem);
}

public static void main(String[] args)
{
Divison d = new Divison();
d.getdata();
d.divison();
d.display();
}
}
