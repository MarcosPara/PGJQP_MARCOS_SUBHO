#include <iostream>
using namespace std;
class array{
    public: void display()
{
int countPositive=0, countNegative=0, countZero=0, arr[100], i, num;
cout<<"enter number of variable: ";
cin>>num;
for(i=0; i<num; i++)
{
cin>>arr[i];
}
for(i=0; i<num; i++)
{
if(arr[i]<0)
{
countNegative++;
}
else if(arr[i]==0)
{
countZero++;
}
else
{
countPositive++;
}
}
cout<<"Positive numbers are: "<<countPositive<<endl;
cout<<"Negative numbers are: "<<countNegative<<endl;
cout<<"Total zeros are: "<<countZero<<endl;
}
};
int main()
{
    array a1;
    a1.display();
}
