package Assign3;
import java.util.Scanner;
class evenodd
{
 public static void main(String[] args) 
{
int[] arr=new int[10];
int count,i,eCount=0,oCount=0;
System.out.println("Enter the values in array");
Scanner sc=new Scanner(System.in);
count=sc.nextInt();
System.out.println("Enter elements in the array:"+count);
for(i=0;i<count;i++)
{
arr[i]=sc.nextInt();
}
  for(i = 0; i < count; i++)
{
if(arr[i]%2!=0)
{
oCount++;
}
if(arr[i]%2==0)
{
eCount++;
}
}
System.out.println("Odd Numbers ="+oCount);
System.out.println("Even Numbers ="+eCount);
} 
}
