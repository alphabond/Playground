#include<iostream>
using namespace std;
int main()
{
  int age ;
  float time,matinee,regular;
  matinee = 13.30;			//matinee means afternon time for show
  regular = 10.15,18.00,22.00;
  cin >>age;
  cin >>time;
  if (age >= 13)
  {
    if (time == regular)
    {
      cout <<"$8.00";
    }
    else
    {
      cout<<"$5.00";
    }
  }
  else if (age < 13)
  {
    if (time  == regular)
    {
        cout<<"$4.00";
    }
    else
    {
      	cout<<"$2.00";
    }
  }
  
}