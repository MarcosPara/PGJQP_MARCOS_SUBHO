#include<iostream>
using namespace std;
class decisionEx
{
    int n1;
    public: void check_div()
    {
        cout<<"Enter the number";
        cin>>n1;
        if(n1%9==0)
        {
         cout<<" number is divisible than 9";
        }
        else{
            cout<<" number is not divisible than 9";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_div();

}



