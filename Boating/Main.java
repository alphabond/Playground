#include<iostream>
using namespace std;
int main()
{
  int boat,adult,child,x1,x2,total;
  x1 = 75;
  x2 = 30;
  cin>>boat;	//weight boat can handle
  cin>>adult;	//number of adult in the boat
  cin>>child;	//number of child in the boat
  total = (adult*x1) + (child*x2);	//total weight of adult & child
  if (total <= boat)
  {
    cout<<"Boat is stable";
  }
  else
  {
    cout<<"Boat will drow";
  }
}