#include<iostream>
using namespace std;
int main()
{
  int mon ,m1=0,m2=1,m3;
  cin>>mon;
  for (int i=2;i<mon;i++)
  {
    m3=m1+m2;
    m1=m2;
    m2=m3;
    //cout<<m3<<"\n";
  }
  cout<<m3<<"\n";
}
