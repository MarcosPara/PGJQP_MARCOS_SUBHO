#include <iostream>
using namespace std;
class natural_num{
public: void display()
{
    int i,s=0;
    for (i=1; i<=10; i++)
    {
        cout<<i<<" ";
		s=s+i;
    }
     cout << "\n The sum of first 10 Matural Numbers: "<<s<< endl;
}
};
int main()
{
    natural_num n1;
    n1.display();
}
