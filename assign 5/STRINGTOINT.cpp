#include <iostream>
#include <sstream>
using namespace std;

int main()
{

    string s = "785966";
    stringstream str(s);
    int x =0;
    str>>x;
    cout<<"Value of x : "<<x;
    return 0;
}
