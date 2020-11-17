#include<iostream>
using namespace std;
class decisionEx
{
    int n1,n2,r1,r2;
    public: void check_admul()
     {
     cout<< "Enter first number";
     cin>>n1;
     cout<<"Enter second number";
     cin>>n2;
     r1=n1+n2;
     cout<<"Result is : \t "<<r1<<"\n";
     r2=n1*n2;
     cout<<"Result is : \t "<<r2<<"\n";

        if(r1>r2)
        {
         cout<<" Addition of two number is greater ";
        }
        else{
            cout<<" Multiplication of two number is greater";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_admul();

}



