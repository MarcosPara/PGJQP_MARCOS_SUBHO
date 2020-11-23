#include<iostream>
using namespace std;
 class csquare;
 class crectangle{
 int w,h;
 public:
     int area()
     {
         return(w*h);
     }
     void convert(csquare a);



 };

 class csquare{
 private:
     int side;
 public:
    void set_side(int a)
    {
        side=a;
    }
    friend class crectangle;
};

void crectangle::conver(csquare a){
w=a.side;
h=a.side;
}

int main()
{
   csquare sqr;
   crectangle rect;
   sqr.set side(4);
   rect.convert(sqr);
   cout<<rect.area();
   return 0;
}
