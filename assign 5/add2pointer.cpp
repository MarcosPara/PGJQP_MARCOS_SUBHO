#include <iostream>
using namespace std;
class pointer{
    public: void display()
{
   int  num1, num2;
   int  *ptr1,* ptr2;
   int  sum;
   cout<<"\n Enter first number: ";
   cin>>num1;
   cout<<"\n Enter second number: ";
   cin>>num2;
   ptr1 = &num1;
   ptr2 = &num2;
   sum = *ptr1 + * ptr2;
   cout<<"\n Sum is: "<<sum;

}
};
 int main()
 {
     pointer p1;
     p1.display();
 }
