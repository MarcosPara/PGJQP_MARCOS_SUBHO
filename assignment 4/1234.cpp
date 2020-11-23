#include<iostream>
using namespace std;
class employee{
char firstname[20];
char lastname[20];
char dob[20];
char dateofjoin[20];
char city[20];
char mob[10];
public: void accept()
{
    cout<<"\nEnter Employee Detail";
    cout<<"\n......................\n";
    cout<<"First Name : \n"<<endl;
    cin>>firstname;
    cout<<"Last Name : \n"<<endl;
    cin>>lastname;
     cout<<"Date of Birth : \n"<<endl;
    cin>>dob;
     cout<<"Date of Joining : \n"<<endl;
    cin>>dateofjoin;
    cout<<"City : \n"<<endl;
    cin>>city;
    cout<<"Mobile Number : \n"<<endl;
    cin>>mob;

}
void display()
{
    cout<<"\n           Details of the Employee\n"<<endl;
    cout<<"\n.............................................\n"<<endl;
    cout<<"\nFirst Name :"<<firstname<<""<<"\t Last Name :"<<    lastname<<endl;
    cout<<"\nDate of Birth :"<<dob<<""<<"\t Date of Joining :"<<dateofjoin<<endl;
    cout<<"\nCity :"<<      city<<"     "<<"\t Mobile Number: "<<mob<<endl;
    cout<<"\n.............................................\n";
    cout<<endl;
}
};
int main()
{
    employee b1;
    b1.accept();
    b1.display();
}

