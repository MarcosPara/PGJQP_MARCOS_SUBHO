#include <iostream>
using namespace std;
class abc{
    public: void display()
 {
    int n, temp;
    int count=0;
    cout<<"Enter any number : ";
    cin>>n;
    temp=n;

    while(temp!=0)
        {
        count++;
        temp/=10;
    }
    cout<<endl<<"Total digits are " <<n<<" : " <<count;

}
};
int main()
{
    abc a1;
    a1.display();
}
