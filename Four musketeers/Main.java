#include<iostream>
using namespace std;
int main()
{
  int x1,x2,x3,y1,y2,y3;
  float a,b;
  cin>>x1;
  cin>>y1;
  cin>>x2;
  cin>>y2;
  cin>>x3;
  cin>>y3;
  a = (x1+x2+x3)/3.0; //doubt is it only work when a value is in float ex 3.0 and not in int that is 3
  b = (y1+y2+y3)/3.0;
  cout<<a<<"\n";
  cout<<b;
}