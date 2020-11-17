#include <iostream>
using namespace std;
int main() {
   int a,b;
    cout<<"enter 1st Number";
   cin>>a;
   cout<<"enter 2nd number";
   cin>>b;
   a = a+b;
   b = a-b;
   a = a-b;
   cout<<"Value of a is "<<a<<endl;
   cout<<"Value of b is "<<b;
   return 0;
}
