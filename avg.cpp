#include<iostream>
using namespace std;
class decisionEx
{
    int n1,n2,n3,n4,n5;
    public: void check_avg()
    {
        cout<<"Enter 1st number";
        cin>>n1;
        cout<<"Enter 2nd number";
        cin>>n2;
        cout<<"Enter 3rd number";
        cin>>n3;
        cout<<"Enter 4th number";
        cin>>n4;
        cout<<"Enter 5th number";
        cin>>n5;
        if(((n1+n2+n3+n4+n5)/5)>10)
        {
         cout<<"AVG number is greater than 10";
        }
        else{
            cout<<"Avg number is Smaller than 10";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_avg();

}




