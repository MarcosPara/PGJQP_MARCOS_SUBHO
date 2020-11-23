#include<iostream>
using namespace std;
class array{
public: void display()
{
	int arr[50], size, i, j, temp;
	cout<<"Enter array size : ";
	cin>>size;
	cout<<"Enter array elements : ";
	for(i=0; i<size; i++)
	{
		cin>>arr[i];
	}
	j=i-1;  // now j will point to the last element
	i=0;   //  and i will be point to the first element
	while(i<j)
	{
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		i++;
		j--;
	}
	cout<<"Now the Reverse of the Array is : \n";
	for(i=0; i<size; i++)
	{
		cout<<arr[i]<<" ";
	}
}
};
int main()
{
    array a1;
    a1.display();
}
