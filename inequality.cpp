#include<iostream>
using namespace std;
class decisionEx
{
    int n1,n2;
    public: void check_inequality()
    {
        cout<<"Enter 1st number";
        cin>>n1;
        cout<<"Enter 2nd number";
        cin>>n2;
        if(n1!=n2)
        {
         cout<<"inequal Number";
        }
        else{
            cout<<"equal number";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_inequality();

}



