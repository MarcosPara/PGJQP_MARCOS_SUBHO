#include<iostream>
using namespace std;

int main()
{
   int choice;
   long num1, num2, x;
   cout<<"Please choose your option:"
           "\n1 = Addition"
           "\n2 = Subtraction"
           "\n3 = Multiplication"
           "\n4 = Division"
           "\n5 = Squares"
           "\n6 = exit"
           "\n\nChoice: ";
   cin>>choice;
   while(choice<1 || choice>6)
   {
      cout<<"\nPlease choose the above mentioned option."
              "\nChoice: ";
      cin>>choice;
   }

   switch (choice)
   {
      case 1:
         cout<<"Enter two numbers: \n";
         cin>>num1>>num2;
         x=num1+num2;
         cout<<"Sum="<<x;
         break;

      case 2:
         cout<<"Enter two numbers: \n";
         cin>>num1>>num2;
         x=num1-num2;
         cout<<"Subtraction="<<x;
         break;

      case 3:
         cout<<"Enter two numbers: \n";
         cin>>num1>>num2;
         x=num1*num2;
         cout<<"Product="<<x;
         break;

      case 4:
         cout<<"Enter 1st Number: ";
         cin>>num1;
         cout<<"Enter 2nd Number: ";
         cin>>num2;
         x=num1/num2;
         cout<<"\nQuotient="<<x;
         break;

      case 5:
         cout<<"Enter any number: \n";
         cin>>num1;
         x=num1*num1;
         cout<<"Square="<<x;
         break;

      case 6:
         return 0;

      default: cout<<"\n Wrong input";
   }
}
