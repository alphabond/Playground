#include<iostream>
using namespace std;
int main()
{
 int num;
  int sum = 0;
  cin>>num;
   int temp = num;
  while(num >0)
  {
    int r = num%10;
    sum = sum + r;
    num = num/10;
  }
	if (temp % sum == 0)
  {
    cout<<"Harshad Number";
  }
  else if (temp % sum != 0)
  {
    cout<<"Not Harshad Number";
  }
}