package Assign3;
import java.util.Scanner;
class odd
{
 public static void main(String[] args) 
{
int[] arr=new int[10];
System.out.println("Enter the values in array");
Scanner sc=new Scanner(System.in);
for(int index=0;index<5;index++)
{
arr[index]=sc.nextInt();
}
for(int index=0;index<5;index++)
{
if(arr[index]%2!=0)
{
System.out.println("The Odd Number is:"+arr[index]);
}
}
} 
}
