#include<iostream>
using namespace std;
class decisionEx
{
    int n;
    public: void check_even()
    {
        cout<<"Enter a number";
        cin>>n;
        if(n%2==0)
        {
         cout<<"Even";
        }
        else{
            cout<<"Odd";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_even();

}


