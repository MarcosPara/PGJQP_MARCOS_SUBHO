#include <iostream>
using namespace std;
class reverseorder{
public: void PrintReverseOrder()
{
int n,i;
cout<<"enter the number :";
cin>>n;
    for (i= n; i>0; i--)
        cout<<i<< " ";

}
};
int main()
{
    reverseorder r1;
    r1.PrintReverseOrder();

}
