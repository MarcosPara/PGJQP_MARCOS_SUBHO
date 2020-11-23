#include<iostream>
using namespace std;
class call
{
public: void swap(int *a, int *b)
{
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
    cout<<"in method a="<<*a<<"\t b="<<*b<<endl;
}
};
int main()
{
    call c1;
    int num1=10, num2=20;
    c1.swap(&num1,&num2);
    cout<<"in main num1="<<num1<<"\t num2="<<num2;
}

