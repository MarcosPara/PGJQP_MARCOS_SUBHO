#include <iostream>
using namespace std;
class Lines
{
   public: void setLength(double len);
      double getLength(void);
      Lines();
   private: double length;
};
Lines::Lines(void)
{
   cout<<"Object created"<<endl;
}
void Lines::setLength(double len)
{
   length =len;
}
double Lines::getLength(void)
{
   return length;
}
int main()
{
   Lines l1;
   l1.setLength(14.0);
   cout<<"Length of line : "<<l1.getLength()<<endl;
   return 0;
}
