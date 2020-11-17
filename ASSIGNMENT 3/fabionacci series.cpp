#include <iostream>
using namespace std;
class fabio{
public: void display()
{
    int t1=0,t2=1,nextTerm=0,n;

    cout<<"Enter a positive number: ";
    cin>>n;
    cout<<"Fibonacci Series: "<<t1<<", "<<t2<<", ";

    nextTerm=t1+t2;

    while(nextTerm<=n)
    {
        cout<<nextTerm<< ", ";
        t1=t2;
        t2=nextTerm;
        nextTerm=t1+t2;
    }

}
};
int main()
{
    fabio f1;
    f1.display();
}
