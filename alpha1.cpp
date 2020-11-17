#include<iostream>
using namespace std;
int main()
{
char alpha;
cout<<"Enter a character: ";
cin>>alpha;
if(alpha>=65 && alpha<=90)
{
cout<<alpha<<" is an UPPER CASE ALPHABET ";
}
else if(alpha>=97 && alpha<=122)
{
cout<<alpha<<" is an lower case alphabet ";
}
return 0;
}
