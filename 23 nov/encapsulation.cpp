#include<iostream>
using namespace std;
class Encap
{
    private:
        int x;

    public: void set(int num)
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
    Encap obj;
    obj.set(100);
    cout<<obj.get();
    return 0;
}
