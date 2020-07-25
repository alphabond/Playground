#include<iostream>
using namespace std;
int main()
{
  int date;
  cin>>date;	//birth year enter by user
  if (date%4==0)	//logic for leap year
    cout<<date<<" is a leap year";
  else 
    cout<<date<<" is not a leap year";
}