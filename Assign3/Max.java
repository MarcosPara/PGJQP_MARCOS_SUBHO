package Assign3;
import java.util.Scanner;
class Max
{
 public static void main(String[] args) 
{
int[] arr=new int[5];
int i,max,min,array;
System.out.println("Enter the Size in array");
Scanner sc=new Scanner(System.in);
array=sc.nextInt();
System.out.println("Enter"+array+"elements in the array");
for(int index=0;index<5;index++)
{
arr[index]=sc.nextInt();
}
max=arr[0];
min=arr[0];
for(int index=0;index<5;index++)
{
if(arr[index]>max)
max=arr[index];
if(arr[index]<min)
min=arr[index];
}
System.out.println("Maximum Element ="+max);
System.out.println("Minimum Element ="+min);
}
}

