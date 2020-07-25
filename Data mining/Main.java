#include<iostream>
using namespace std;
int main()
{
  int input,sum=0,rem,i,temp=0,temp1=0,temp2=0,total;
  cin>>input;
  while (input>0)
  {
    rem=input%10;
    sum = sum + rem;
    input=input/10;
    //cout<<rem<<"\n";
    if(rem%2==0)//even
    {
    	temp1 = temp1+rem;
    	//cout<<temp1<<"\n";  //this is for troubleshooting
    }
    else
    {
        temp2 = temp2+rem;
       // cout<<temp2<<"\n";	//this is for troubleshooting 
    }
    //rem = temp;
    //temp = temp +rem;
    //cout<<temp-1<<"\n";
    //temp++;
    
    
    //if(input%2==0)//even
      
  }
  if(temp1 == temp2)
  {
      cout<<"Yes";
  }
  else
  {
      cout<<"No";
  }
}