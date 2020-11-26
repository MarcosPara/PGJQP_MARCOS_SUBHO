#include<iostream>
using namespace std;
class Calculator
{
    int choice,num1,num2;
    char ch;
    public:void display()
    {

        cout<<"Enter your choice, 1.Addition 2.Subtraction 3.Multiplication 4.Division\n";
        cin>>choice;
        cout<<"Enter two Numbers";
        cin>>num1>>num2;
        switch(choice)
        {
            case 1:cout<<num1+num2;break;
            case 2:cout<<num1-num2;break;
            case 3:cout<<num1*num2;break;
            case 4:cout<<num1/num2;break;
            default:cout<<"invalid choice";
        }
    }
};

int main()
{
    Calculator c1;
    c1.display();
}
