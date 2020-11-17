#include<iostream>
using namespace std;
class decisionEx
{
    int n1,n2,n3;
    public: void check_triple()
    {
        cout<<"Enter 1st number";
        cin>>n1;
        cout<<"Enter 2nd number";
        cin>>n2;
        cout<<"Enter 3rd number";
        cin>>n3;
        if(n1>n2 && n1>n3)
        {
         cout<<"1st number is greater";
        }
        if(n2>n1 && n2>n3)
        {
            cout<<"2nd number is greater";
        }
        else{
            cout<<"3rd number is greater";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_triple();

}




