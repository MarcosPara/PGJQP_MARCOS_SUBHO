#include <iostream>
using namespace std;
class prime{
public: void display()
 {
    int i, n;
    bool isPrime=true;

    cout<<"Enter a positive integer: ";
    cin>>n;

    // 0 and 1 are not prime numbers
    if (n == 0 || n == 1) {
        isPrime = false;
    }
    else {
        for (i=2; i<= n/2; ++i) {
            if (n%i==0) {
                isPrime=false;
                break;
            }
        }
    }
    if (isPrime)
        cout<<n<<" is a prime number";
    else
        cout<<n<<" is not a prime number";


}
};
int main()
{
    prime p1;
    p1.display();
}
