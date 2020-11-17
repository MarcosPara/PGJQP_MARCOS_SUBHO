#include<iostream>
using namespace std;
int main()
{
int marks;

cout<<"Enter marks out of 100: ";
cin>>marks;

if(marks>=90)
{
cout<<"Your grade will be: A"<<endl;
}
else if(marks>=80 && marks<90)
{
cout<<"Your grade will be: B"<<endl;
}
else if(marks>=60 && marks<80)
{
cout<<"Your grade will be: C"<<endl;
}
else if(marks>=45 && marks<60)
{
cout<<"Your grade will be: D"<<endl;
}
else if(marks>45)
{
cout<<"Your grade will be: F"<<endl;
}
else
{
cout<<"Please enter marks between 0-100"<<endl;
}
return 0;
}
