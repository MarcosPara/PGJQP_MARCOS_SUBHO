#include<iostream>
using namespace std;
class array{
    public: void display()
{
    int arr[10], n, i, sum =0, pro =1;
    cout<<"Enter the size of the array : ";
    cin>>n;
    cout<<"\nEnter the elements of the array : ";
    for(i=0; i<n; i++)
    cin>>arr[i];
    for(i=0; i<n; i++)
    {
        sum += arr[i];
        pro *= arr[i];
    }
    cout<<"\nSum of array elements : \n"<<sum;
    cout<<"\nProduct of array elements :\n"<<pro;
}
};
int main()
{
    array a1;
    a1.display();
}
