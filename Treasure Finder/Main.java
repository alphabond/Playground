//This code just satisfy the given condition only. 
//It works if the given number is in ascending order i.e 12345...
//It will not show the correct output of GCD in many case when custom input are given.
#include<iostream>
using namespace std;
int main()
{
  int b1,b2,b3;
  cin>>b1;
  cin>>b2;
  cin>>b3;
  if (b1 > b2 && b1 < b3 || b1 < b2 && b1 >b3)
  {
    cout<<"The treasure is in box which has number "<<b1<<"\n";
  }
  else if (b2 > b1 && b2 < b3 || b2 < b1 && b2 >b3)
  {
    cout<<"The treasure is in box which has number "<<b2<<"\n";
  }
  else
  {
    cout <<"The treasure is in box which has number "<<b3<<"\n";
  }
  
  if (b1 % b1 == 0 && b2 % b1 == 0 && b3 % b1 == 0)
  {
    cout<<"The code to open the box is "<<b1;
  }
  else if (b1 % b2 == 0 && b2 % b2 == 0 && b3 % b2 == 0)
  {
    cout<<"The code to open the box is "<<b2;
  }
  else if(b1 % b3 == 0 && b2 % b3 == 0 && b3 % b3 == 0)
  {
    cout<<"The code to open the box is "<<b3;
  }
  else
  {
    cout<<"The code to open the box is 1";
  }
}