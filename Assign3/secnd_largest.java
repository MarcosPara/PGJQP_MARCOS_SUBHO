package Assign3;
import java.util.Scanner;
class secnd_largest
{
 public static void main(String[] args) 
{
int[] num=new int[50];
int n,largest,second;
System.out.println("Enter the number of elements in array");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int i=0;i<n;i++)
{
System.out.println("Enter Array elements:"+(i+1));
num[i]=sc.nextInt();
}
  if(num[0]<num[1])
    {
      largest = num[1];
      second = num[0];
    }
   else
   {
      largest = num[0];
      second = num[1];
   }
   for (int i = 2; i< n ; i ++)
{
   if (num[i] > largest)
      {
         second = largest;
         largest = num[i];
      }
  else if (num[i] > second && num[i] != largest)
      {
         second = num[i];
      }
}
System.out.println("Second largest element in array is:"+second);

}
}

