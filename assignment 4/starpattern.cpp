#include <iostream>
#include <conio.h>
using namespace std;
class pattern{
public: void display()
{
    int i,j,rows;
    cout << "Enter value to number of rows" << endl;
    cin>>rows;
    for(i=1; i<=rows; i++){
        for(j=1; j<=i; j++){
        cout<<"*";
    }
    cout<<"\n";
    }
}
};
int main()
{
    pattern p1;
    p1.display();
}
