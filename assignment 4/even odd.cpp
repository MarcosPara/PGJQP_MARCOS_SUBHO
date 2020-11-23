#include <iostream>
#include <conio.h>
using namespace std;
class array{
    public: void accept()
{
    int arr[100],i,num;
    cout<<"Enter the size of the array you want\n";
    cin>>num;
    cout<<"Enter the elements of the array\n";
    for(i=0; i<num; i++){
        cin>>arr[i];
    }
    cout<<"\nEven numbers of the array are \n";
     for(i=0; i<num; i++){
        if(arr[i]%2==0){
            cout<<arr[i]<<"\t";
        }
    }
    cout<<"\nOdd numbers of the array are \n";
     for(i=0; i<=num; i++){
        if (arr[i]%2==1){
            cout<<arr[i]<<"\t";
        }
    }
}
};

int main()
{
    array a1;
    a1.accept();
}
