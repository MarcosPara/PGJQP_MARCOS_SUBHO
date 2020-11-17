#include<iostream>
using namespace std;
class decisionEx
{
    int n1,n2;
    public: void check_equality()
    {
        cout<<"Enter 1st number";
        cin>>n1;
        cout<<"Enter 2nd number";
        cin>>n2;
        if(n1==n2)
        {
         cout<<"Equal Number";
        }
        else{
            cout<<"Unequal number";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_equality();

}



