#include <iostream>
using namespace std;
class Abstraction
{
    private:
        int a, b;

    public: void set(int num1, int num2)
        {
            a = num1;
            b = num2;
        }

        void display()
        {
            cout<<"a = " <<a << endl;
            cout<<"b = " << b << endl;
        }
};

int main()
{
    Abstraction obj;
    obj.set(100, 200);
    obj.display();
    return 0;
}
