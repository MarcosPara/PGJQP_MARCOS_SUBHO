#include<iostream>
using namespace std;
class Even
{
    int num;
    public:
        int checkevenodd(int num)
        {
            cout<<"Enter a number";
            cin>>num;
            if(num%2==0)
            {
                cout<<"Even:";
            }
        else
            {
                cout<<"Odd:";
            }
            return 0;
        }
int checkpositivenegative(int num)
{
    if(num>0)
    {
        cout<<"\nThe number is positive:";
    }
    else
    {
        cout<<"The number is negative:";
    }
    return 0;
}
};
int main()
{
    Even e1;
    e1.checkevenodd(5);
    e1.checkpositivenegative(5);
}

