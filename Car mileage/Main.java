#include<iostream>
using namespace std;
int main()
{
  float mil;
  int  lit,dis;
  cin >>mil;	//milage of car
  cin >>lit;	//litre of petrol in car
  cin>>dis;		//distace yet to travel
  int dtotal = mil*lit;	//total distance we can travel with that petrol
  if (dis <= dtotal)
  {
    cout<<"Can reach";
  }
  else
  {
    cout<<"Cannot reach";
  }  
}