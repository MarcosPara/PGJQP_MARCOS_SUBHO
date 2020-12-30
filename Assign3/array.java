package Assign3;
import java.util.Scanner;
class array
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
System.out.println("The values in array are");
for(int index=0;index<5;index++)
{
System.out.println(arr[index]*2);
}
}
} 
