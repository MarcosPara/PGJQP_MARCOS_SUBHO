package Assign3;
import java.util.Scanner;
class maxmin
{
 public static void main(String[] args) 
{
int[] arr=new int[10];
int n,max,min,i;
System.out.println("Enter the Size in array");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
System.out.println("Enter elements in the array:"+n);
for (i = 0; i < n; i++)
{
arr[i]=sc.nextInt();
}
max=arr[0];
for (i = 0; i < n; i++)
{
    if (max < arr[i])
    max = arr[i];
}
min = arr[0];
for (i = 0; i < n; i++)
{
   if (min > arr[i])
   min = arr[i];
}
System.out.println("Largest Element ="+max);
System.out.println("Smallest Element ="+min);
}
}

