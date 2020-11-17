#include <iostream>
using namespace std;
class armstrong{
public: void display()

{
    int num, original, remainder, result =0;
    cout<<"Enter a three-digit number: ";
    cin>>num;
    original=num;

    while (original!=0) {
        remainder =original%10;
        result+=remainder*remainder*remainder;
        original/=10;
    }

    if (result==num)
        cout<<num<<" is an Armstrong number.";
    else
        cout<<num<<" is not an Armstrong number.";
}
};
 int main()
 {
     armstrong a1;
     a1.display();
 }
