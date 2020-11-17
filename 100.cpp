#include<iostream>
using namespace std;
class decisionEx
{
    int n1,n2;
    public: void check_100()
    {
        cout<<"Enter 1st number";
        cin>>n1;
        cout<<"Enter 2nd number";
        cin>>n2;
        if(n1+n2>=100)
        {
         cout<<" number is greater than 100";
        }
        else{
            cout<<" number is smaller than 100";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_100();

}



