package Assign3;
import java.util.Scanner;
class add1d
{
 public static void main(String[] args) 
{
int[] first=new int[20];
int[] second=new int[20];
int[] sum=new int[20];
int c,n;
System.out.println("Enter the number of elements in the array");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter elements of first array");
for(c=0; c<n; c++)
{
first[c]=sc.nextInt();
}
System.out.println("Enter Elements of second array:");
for(c=0; c<n; c++)
        {
                second[c]=sc.nextInt();
        }
System.out.println("Sum of elements of the arrays:");     
for(c=0; c<n; c++)
{
sum[c]= first[c]+ second[c];
System.out.print("The sum of first and second is:"+sum[c]);
}
}
}