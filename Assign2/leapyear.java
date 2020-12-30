package Assign2;
import java.util.Scanner;
public class leapyear
{
    public static void main(String args[])
    {
        int year;
        System.out.println("Enter the Year : ");
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();	
if(year%4==0)
        {
            System.out.println("is a leap year");
        }
      else
        {
            System.out.println("is not a leap year");
        }
    }
}
 