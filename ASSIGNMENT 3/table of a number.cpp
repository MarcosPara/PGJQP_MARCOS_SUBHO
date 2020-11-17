#include<iostream>
using namespace std;
class table{
public: void display()
{
	int a,n;
	cout<<"Enter the number:";
	cin>>n;
	for(a=1;a<=10;++a)
	cout<<"\n"<<n<<" * "<<a<<" = "<<n*a;

}
};
int main()
{
    table t1;
    t1.display();
}
