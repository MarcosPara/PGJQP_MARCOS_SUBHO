package Assign3;
import java.util.Scanner;
class replacenum
{
 public static void main(String[] args) 
{
int[] arr=new int[100];
int num,i;
System.out.println("Enter the number of elements in array");
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
System.out.println("Enter elements of array:");
for(int index=0;index<num;index++)
{
arr[index]=sc.nextInt();
}

{
for(i=0;i<num;i++)
{
if(arr[i]<0)
{
arr[i]=0;
}
System.out.print("The new array is: "+arr[i]);
}
}
}
}
