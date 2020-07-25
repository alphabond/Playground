#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int item;
  float time,Ntime;
  cin>>item;
  cin>>time;
  if ( item == 2 || item == 3)
  {
    if (item == 2)
    {
      Ntime = time*1.00  + (time *0.50);
      cout<<Ntime*1.00;
    }
    else if (item == 3)
    {
      Ntime = time*1.00 + (time *1.00);
      cout<<Ntime;
    }
  }
  else
  {
    cout <<"Number of items is more";
  }
}