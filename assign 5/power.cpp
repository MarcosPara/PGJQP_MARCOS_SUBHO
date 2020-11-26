#include <iostream>
using namespace std;
class power
{
    int exponent;
    float base, result =1;
public: display(int exponent)
    {
    cout<<"Enter base and exponent respectively:  ";
    cin>>base>>exponent;
    cout<<base<<"^"<<exponent<<" = ";
    while(exponent!=0)
        {
        result*= base;
        --exponent;
        }
    cout<<result;
    return 0;
}
};
int main()
{
    power p1;
    p1.display(5);
}
