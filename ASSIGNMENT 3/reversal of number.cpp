#include <iostream>
using namespace std;
class reverse{
public: void reversal()
 {
    int n,reversednumber=0,remainder;

    cout<<"Enter any number: ";
    cin>>n;

    while(n!=0)
        {
        remainder=n%10;
        reversednumber=reversednumber*10+remainder;
        n/=10;
    }
    cout<<"Reversed Number = "<<reversednumber;
}
};
int main()
{
    reverse r1;
    r1.reversal();
}
