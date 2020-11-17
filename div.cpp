#include<iostream>
using namespace std;
class decisionEx
{
    int n1;
    public: void check_div()
    {
        cout<<"Enter the number";
        cin>>n1;
        if(n1%7==0)
        {
         cout<<" number is divisible than 7";
        }
        else{
            cout<<" number is not divisible than 7";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_div();

}



