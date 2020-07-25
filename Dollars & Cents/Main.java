#include<iostream>
using namespace std;
int main()
{
  int d1,c1,d2,c2,Dol,Cent;
  cin>>d1>>c1>>d2>>c2;
  Dol = d1 + d2;
  Cent = c1 + c2;
   if ( Cent > 100)
  {
    cout<<Dol+1<<"\n";
    cout<<Cent - 100;
  }
  else
  {
  cout<<Dol<<"\n";
  cout<<Cent;
  }
  return 0;
}