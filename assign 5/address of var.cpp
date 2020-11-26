#include <iostream>
using namespace std;
int main ()
{
  int fvalue,value;
  int *mypointer;

  mypointer =&firstvalue;
  *mypointer =14;
  mypointer =&secondvalue;
  *mypointer =06;
  cout<<"The First Value is "<<fvalue<<'\n';
  cout<<"The Second Value is "<<value<<'\n';
  return 0;
}
