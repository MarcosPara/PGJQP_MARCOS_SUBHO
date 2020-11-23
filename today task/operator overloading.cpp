#include <iostream>
using namespace std;
class cont
{
   private:

    int val;

   public:
    cont() : val(7)
    {
    }
    void operator ++()
    {
        ++val;
    }

    void display()
    {
        cout<<"Count: "<<val<<endl;
    }
};

int main()
{
    cont count1;
    ++count1;
    count1.display();
    return 0;
}
