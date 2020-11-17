#include<iostream>
#include<cctype>
using namespace std;

int main()
{
    char c;

    cout<<"Enter the character : ";
    cin>>c;

    if(!isalpha(c))
        cout<<c<<" is not an alphabetical character."<<endl;
    else
    {
        int case_val;
        if (c>='a' && c<='z')
        {
            c=c-'a'+'A';
            case_val = 1;
        }
        else if(c>='A'||c<='Z')
        {
            c=c+'a'-'A';
            case_val=0;
        }
        cout<<c<<" is the "<<((case_val==1)?"upper" : "lower")
             <<"case of given character "<<endl;
    }
}
