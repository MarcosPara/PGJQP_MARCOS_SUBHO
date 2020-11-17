#include<iostream>
using namespace std;
int main()
{
char alpha;
cout<<"Enter a character: ";
cin>>alpha;
if((alpha>=65 && alpha<=90)||(alpha>=97 && alpha<=122))
{
cout<<alpha<<" is an alphabet ";
}
else
{
cout<<alpha<<" is not an alphabet ";
}
return 0;
}
