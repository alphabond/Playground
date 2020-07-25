#include <iostream>
using namespace std;

int main() 
{
  int a,b,c,d;
  cin>>a>>b;
  //cout<<a<<b;
  //c=&a;
  //d=&b;
  cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
    cout<<"After swapping a= "<<a<<" and b="<<b;
  
    return 0;
}

void swap(int &s1,int &s2)
{
  int temp;
  temp=s1;
  s2=s1;
  s2=temp;
}