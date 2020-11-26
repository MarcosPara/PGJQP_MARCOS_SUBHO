#include<iostream>
using namespace std;
int reverse(int n);
int main()
{
 int n=0, result=0;
 cout<<"Enter Number: ";
 cin>>n;
 result=reverse(n);
 cout<<"Reverse number is: " <<result <<endl;
}
int reverse(int n)
{
 int temp=0, rev=0;
 while(n!=0)
 {
     temp=n%10;
     rev=(rev*10)+temp;
     n=n/10;
 }
 return rev;
}
