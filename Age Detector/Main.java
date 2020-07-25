#include<iostream>
using namespace std;
int main()
{
  int byr,cyr;
  cin >>byr;	//birth year
  cin >>cyr;	//current year
  if (byr > cyr) //it means that birth year is in 1900 and current year is in 2000
  {
    byr = 1900 + byr;
    cyr = 2000 + cyr;
    cout<<cyr - byr;
  }
   else if (byr < cyr) // it means that birth year is in 2000 and current year is in 2000 
   {
      byr = 2000 + byr;
      cyr = 2000 + cyr;
      cout <<cyr - byr;
   }
 
}