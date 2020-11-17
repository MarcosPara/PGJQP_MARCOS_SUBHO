#include <iostream>
using namespace std;
class floyd{
public: void display()
{
    int n,i,c,a=1;
    cout<<"Enter the number of rows of Floyd's triangle to print: ";
    cin>>n;

    for (i =1; i<=n; i++)
    {
        for (c =1; c<=i; c++)
        {
            cout<<a;
            a++;
        }
        cout<<endl;
    }
}
};
int main()
{
    floyd f1;
    f1.display();
}
