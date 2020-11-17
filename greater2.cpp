#include<iostream>
using namespace std;
class decisionEx
{
    int n1,n2,result;
    public: void check_both()
    {
        cout<<"Enter 1st number";
        cin>>n1;
        cout<<"Enter 2nd number";
        cin>>n2;
        if(n1>n2)
        {
         cout<<"1st number is greater";
        }
        else{
            cout<<"2nd number is greater";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_both();

}



