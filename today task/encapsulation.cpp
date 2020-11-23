
#include<iostream>
using namespace std;

class Encapsulation
{
    private:
        int x;

    public:
        void set(int num)
        {
            x =num;
        }
        int get()
        {
            return x;
        }
};

int main()
{
    Encapsulation obj;

    obj.set(100);

    cout<<obj.get();
    return 0;
}
