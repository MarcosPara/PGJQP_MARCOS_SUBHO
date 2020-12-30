package Assign3;
import java.util.Scanner;
class positive
{
 public static void main(String[] args) 
{
int[] input=new int[100];
int count,i,nCount=0,pCount=0,zCount=0;
System.out.println("Enter the number of elements in array");
Scanner sc=new Scanner(System.in);
count=sc.nextInt();
System.out.println("Enter"+count+"elements in the array");
for(i=0;i<count;i++)
{
input[i]=sc.nextInt();
}
  for(i = 0; i < count; i++)
        {
        if(input[i] < 0)
        {
            nCount++;
        }
    else if(input[i] > 0)
        {
            pCount++;
        }
 else
    {
     zCount++;
    }
    }
System.out.println("Negative Numbers ="+nCount);
System.out.println("Positive Numbers ="+pCount);
System.out.println("Zeroes ="+zCount);
}
}
