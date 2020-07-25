#include<iostream>
using namespace std;
int main()
{
  int p,r,y;
  float interest, amount,discount,settalment;
  cin>>p;	//principle amount
  cin>>r;	//Intrest
  cin>>y;	//no. of year
  interest = (p*r*y)/100 ;	//rate of intrest
  amount = p + interest;
  discount =interest *.02 ;
  //discount = 
  settalment = amount - discount;
  cout<<interest<<"\n";
  cout<<amount<<"\n";
  cout<<discount<<"\n";
  cout<<settalment<<"\n";
}