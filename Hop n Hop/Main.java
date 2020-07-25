#include <iostream>
using namespace std;

int main() 
{
 int x,y,a,b,c,d;
  cin>>a;
  cin>>b;
  x = 3;
  y = 4;
  c = a-x;	//differece between bunny and friend from x prespective
  d = b-y;	//difference between bunny and friend from y prespective
  // max differecnce will be the number of times bunny has to hpoe to reach destination
  (c>=d)?cout<<c:cout<<d;//using ternary operator
}