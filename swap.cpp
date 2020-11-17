#include <iostream >
using namespace std;
int main() {
   int a,b,temp;
   cout<<"enter 1st Number";
   cin>>a;
   cout<<"enter 2nd number";
   cin>>b;
   temp = a;
   a = b;
   b = temp;
   cout<<"Value of a is "<<a<<endl;
   cout<<"Value of b is "<<b;
   return 0;
}
