#include <iostream>
using namespace std;
class reversal{
public: void printreversefloyd()
{
    int n;
    cout<<"enter the number :\n";
    cin>>n;
    int curr_val = n*(n+1)/2;
    for (int i=n; i>=1; i--) {
        for (int j=i; j>=1; j--)
            {
            cout<<curr_val-- << "  ";
        }

        cout<<endl;
    }
}
};

int main()
{
    reversal r1;
    r1.printreversefloyd();
    }
