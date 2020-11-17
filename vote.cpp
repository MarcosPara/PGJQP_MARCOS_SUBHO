#include<iostream>
using namespace std;
class decisionEx
{
    int n;
    public: void check_age()
    {
        cout<<"Enter the age of person";
        cin>>n;
        if(n>=18)
        {
         cout<<"Eligible for vote";
        }
        else{
            cout<<"Not eligible to vote";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_age();

}


