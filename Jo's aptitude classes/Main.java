#include <iostream>
using namespace std;

int main() 
{
  int num1,num2,num3,ans;
  int small=0,gcd=0,flag=0;
  cin>>num1>>num2>>num3;
  cin>>ans;
  if(num1<num2 && num1<num3)
  {
    small=num1;
  }
  else if(num2<num1&&num2<num3)
  {
    small=num2;
  }
  else
  {
    small=num3;
  }
  //cout<<small<<"\n";	//to cross check the smallest num
  while(small>=1)
  {
    if(num1%small==0 && num2%small==0 && num3%small==0)
    {
      gcd = small;
      break;
    }
    
    small--;
   }
  //cout<<gcd<<"\n";	//to check gcd
  if (gcd == ans)
  {
    cout<<"Answer is correct.";
  }
  else
  {
    //flag=0;
    cout<<"Answer is wrong.";
  }
  
}