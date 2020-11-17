#include <iostream>
using namespace std;
class abc{
public: void display()
{
    int i;
    for (i = 1; i <= 10; i++)
    {
        cout<<i<<" ";
    }
    cout<<endl;
}
};
int main()
{
    abc f1;
    f1.display();
}
