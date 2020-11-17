#include <iostream>
using namespace std;
class even{
public: void printEvenNumbers()
{
 int N;
    cout<<"Enter the number: \n";
    cin>>N;
    for (int i = 1; i<= 2 * N; i++) {
        if (i%2==0)
            cout<<i<<" ";
    }
}
void printOddNumbers()
{
    int N;
   cout<<"Enter the Number :\n";
   cin>>N;
    cout<<"\nOdd: ";
    for (int i=1; i<=2 * N; i++) {


        if (i%2!=0)
            cout<<i<< " ";
    }
}
};
int main()
{
 even e1;
 e1.printOddNumbers();

}
