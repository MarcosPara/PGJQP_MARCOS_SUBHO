#include<iostream>
using namespace std;
class staticx
{
    static int num;
    public:void accept()

    {

     cout<<"The incremented number is:"<<num++<<endl;


    }
};
    int staticx::num=1;

    int main()
    {

            staticx obj1,obj2;
            obj1.accept();
            obj2.accept();
    }

