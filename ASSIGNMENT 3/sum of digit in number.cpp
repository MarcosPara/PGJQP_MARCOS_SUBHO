#include<iostream>
using namespace std;
class abc{
public: void display()

    {
        int s,n=0;
        cout<<"enter a number:\n";
        cin>>s;


    while (n!=0)
    {
     s=s+n%10;
     n=n/10;
    }

 }
};

int main()
{
abc a1;
a1.display();
}
