package Assign3;
import java.util.Scanner;
class sumofall
{
 public static void main(String[] args) 
{
int[] arr=new int[20];
int i,n,sum=0;
System.out.println("How many elements you want to enter:");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter any elements in the array:"+n);
for(i=0; i<n; i++)
{
arr[i]=sc.nextInt();
}

for(i=0; i<n; i++)
        {
              sum=sum+arr[i];
        }
System.out.println("Sum of all elements are:"+sum);
}
}
