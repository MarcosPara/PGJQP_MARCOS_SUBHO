#include <iostream>
using namespace std;
class abc{
public: void display()
{
    char i;
    for (i ='A'; i<='Z'; i++)
    {
        cout <<i<<" ";
    }
}
};
int main()
{
    abc a1;
    a1.display();
}
