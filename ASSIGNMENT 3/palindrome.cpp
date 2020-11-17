#include <iostream>
using namespace std;
class palindrome{
public: void display()
{
     int n,num,digit,rev = 0;
     cout<<"Enter any positive number: ";
     cin>>num;
     n=num;
     do
     {
         digit=num%10;
         rev=(rev*10)+digit;
         num=num/10;
     } while(num!=0);
     cout<<"The reverse of the number is: " <<rev<<endl;
     if (n==rev)
         cout<<"The number is a palindrome.";
     else
         cout<<" The number is not a palindrome.";
}
};
int main()
{
    palindrome p1;
    p1.display();
}
