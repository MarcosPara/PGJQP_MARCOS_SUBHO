#include <iostream>
using namespace std;
class base{
public: void display()
{
    int e;
    float b,r=1;
    cout<<"Enter base and exponent respectively:  ";
    cin>>b>>e;
    cout<<b<< "^" <<e<<" = ";
    while (e!=0)
        {
        r*= b;
        --e;
    }
    cout<<r;
}
};
int main()
{
    base b1;
    b1.display();
}
