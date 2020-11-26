#include<iostream>
using namespace std;
class Example
{
    static int Num;
    int n;
    public: void set_n()
    {
        n = ++Num;
    }
    void show_n()
    {

        cout<<"value of n = "<<n<<endl;
    }
    static void show_Num()
    {

        cout<<"value of Number = "<<Num<<endl;
    }
};
int Example:: Num;
int main()
{
    Example example1, example2;
    example1.set_n();
    example2.set_n();
    example1.show_n();
    example2.show_n();
    Example::show_Num();
    return 0;
}
