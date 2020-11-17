#include<iostream>
using namespace std;
class facto
{
public: void display()
{
int n;
unsigned long long factorial=1;
cout<<"enter any Positive Number: ";
cin>>n;
for(int i=1;i<=n;++i)
{
    factorial*=i;
}
cout<<"factorial of"<<n<<"="<<factorial;
}
};
int main()
{
    facto f1;
    f1.display();
}
