#include<iostream>
using namespace std;
int main()
{
  int circ,sq,dcirc;
  cin>>circ;
  cin>>sq;
  dcirc = circ*2;
  if (dcirc <= sq)
  {
    cout<<"circle can be inside a square";
  }
  else
  {
    cout<<"circle cannot be inside a square";
  }
}