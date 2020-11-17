#include <iostream>
using namespace std;
class prime {
public: void primeinRange()
{
    int flag,l,r;
    cout<<"Enter the number :\n";
    cin>>l;
    cout<<"Enter the number :\n";
    cin>>r;

    for (int i=l; i<= r; i++) {

        if (i == 1 || i == 0)
            continue;

        flag = 1;
        for (int j=2; j<= i/2; ++j) {
            if (i%j==0) {
                flag=0;
                break;
            }
        }
        if (flag==1)
            cout<<i<<" ";
    }
}
};
int main()
{
prime p1;
p1.primeinRange();

}
