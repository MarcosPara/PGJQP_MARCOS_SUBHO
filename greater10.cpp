#include<iostream>
using namespace std;
class decisionEx
{
    int n;
    public: void check_even()
    {
        cout<<"Enter a number";
        cin>>n;
        if(n>=10)
        {
         cout<<"Greater than 10";
        }
        else{
            cout<<"Lesser than 10";

        }
    }

};
int main()
{
    decisionEx d1;
    d1.check_even();

}



