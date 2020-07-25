#include<iostream>
using namespace std;
int main()
{
  int Famt,Fdis,Fship,Samt,Sdis,Sship,Aamt,Adis,Aship;
  int Ffnly,Sfnly,Afnly;
  cin>>Famt; //flipkart amount 
  cin>>Fdis;	//discount
  cin>>Fship;	//shipping
  cin>>Samt;	//snapdeal amount
  cin>>Sdis;	//discount
  cin>>Sship;	//shipping
  cin>>Aamt;	//amazon amount
  cin>>Adis;	//discount
  cin>>Aship;	//shipping
  Ffnly = Famt - (Famt*Fdis/100) + Fship;	 // Flipkart final amoumt after adding shipping charge
  Sfnly = Samt - (Samt*Sdis/100) + Sship;	//Snapdeal final amoumt after adding shipping charge
  Afnly = Aamt - (Aamt*Adis/100) + Aship;	//Amazon final amount after adding shipping charge
  cout<<"In Flipkart Rs."<<Ffnly<<"\n";
  cout<<"In Snapdeal Rs."<<Sfnly<<"\n";
  cout<<"In Amazon Rs."<<Afnly<<"\n";
  if (Ffnly <= Sfnly && Ffnly <= Afnly)
  {
    cout<<"He will prefer Flipkart";
  }
  else if(Sfnly < Afnly)
  {
    cout<<"He will prefer Snapdeal";
  }
  else
  {
    cout<<"He will prefer Amazon";
  }
  
}