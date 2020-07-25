#include<iostream>
using namespace std;
int main()
{
  int target,score,sum=0,i,j=0;
  cin>>target;
  while (sum<target)
 {
      cin>>score;
      sum = sum+score; 
      j++;
  }
  //cout<<temp;
  cout<<"The number of turns is "<<j;
  

}