#include <iostream>
using namespace std;

int requ(int ,int);//we declare function requ 
int main() 
{
  int bact,times,req,ans;
  cin>>bact;
  cin>>times;
  cin>>req;
  ans = requ(bact,times);//call the function
  if(ans>=req)
  {
    cout<<"Doctor, you can proceed with your experiment.";
  }
  else
  {
    cout<<"Sorry Doctor! You need more bacteria.";
  }
  
    return 0;
}
int requ(int bact,int times)//this is function defination
{
  int temp=0,i;
  for (i=1;i<=times;i++)//this loop iterate to get the power of no of bact 
  {
    bact=temp+bact;
    temp=bact;
  }
  return temp;
}