#include<iostream>
using namespace std;
int power(int rem,int times)
{
    int j,i;
    for(i=1,j=1;i<=times;i++)
        j=j*rem;
    return j;
}
int digitnum(int n)
{
  int digit = 0,temp;
  temp = n;
  while(temp!=0)
  {
    digit ++;
    temp = temp/10;
  }
}

int arm(int n)
{
  int rem,times,sum=0,comp=n;
  if (n/1000==0)
  {
    times=3;
  }
  else
  {
    times= 4;
  }
  for (int i=n;i>0;i/=10)
  {
    rem = n%10;
    sum = sum+ power(rem,times);
    n=n/10;   
  }
  if (sum == comp)//here we take comp and not n bcuz n value might change duing running the program; 
  {
    return 1;
  }
  
}
int main()
{
    int n;
    cin>>n;
    if(arm(n)==1)
        cout<<"Kindly proceed with encrypting";
    else
        cout<<"It is not an Armstrong number";
    
}