#include <iostream>
using namespace std;
class Lines
{
    public: void setLength(double len);
      double getLength(void);
      Lines(double len);

   private: double length;
};

Lines::Lines(double len) {
   cout<<"Object created, length = "<<len<<endl;
   length = len;
}
void Lines::setLength(double len)
{
   length = len;
}
double Lines::getLength(void) {
   return length;
}

int main()
{
   Lines l1(14.0);
   cout<<"Length of line : "<<l1.getLength()<<endl;
   l1.setLength(8.0);
   cout<<"Length of line : "<<l1.getLength()<<endl;
   return 0;
}
