#include<iostream>
#include <cmath>
using namespace std;
int main()
{ 
  int chalk,sqrt;
  cin>>chalk ;
  int i =1,result = 1;
  while (result <= chalk)
  {
    result = i*i;		//this is the logic to find squartroot of x
    i++;
  }
  sqrt = i++ - 1;
  cout<< chalk +sqrt;	// this will print the days 
  
  
}