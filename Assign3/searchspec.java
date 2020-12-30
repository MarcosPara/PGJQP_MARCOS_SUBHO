package Assign3;
import java.util.Scanner;
class searchspec
{
 public static void main(String[] args) 
{
int[] arr=new int[10];
int i,num,n,cnt=0,pos=0;
System.out.println("Enter Array size");
Scanner sc=new Scanner(System.in);
n=sc.nextInt();
for(int index=0;index<n;index++)
{
System.out.println("Enter the array elements: ");
arr[index]=sc.nextInt();
}
System.out.println("Enter Element to be searched:");
num=sc.nextInt();
    for(i=0; i<n; i++)
        {
                if(arr[i]==num)
                {
                        cnt=1;
                        pos=i+1;
                        break;
                }
        }
        if(cnt==0)
        {
               System.out.print("Element Not Found..!!");
        }
        else
        {
              System.out.print("Element"+ num+" Found At Position: "+pos);
        }

}
}

