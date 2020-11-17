#include<iostream>
using namespace std;
class decisionEx
{
    int n1;
    public: void check_positive()
    {
        cout<<"Enter 1st number";
        cin>>n1;

        if(n1>0)
        {
         cout<<"number is positive";
        }
       else if(n1<0)
        {
            cout<<"number is negetive";
        }
        else{
            cout<<"number is zero";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_positive();

}




