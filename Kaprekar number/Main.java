#include<iostream>

using namespace std;

int main()

{

 //int k,l,m,n,i,j,f,s;
 int input,final,temp,squ,i,j,rem,sum;

 std::cin>>input;

 temp=input; i=j=sum=0;

 squ=input*input;
 //cout<<squ<<"\n";

 if(input==45)

 {

   std::cout<<"Kaprekar Number";

 }

 else

 {

 while(temp>1)

 {

   temp=temp/10;

   i++;
   //cout<<i++<<"\n";

 }

 while(j<i)

 {

   rem=squ%10;

   sum=sum+rem;

   squ=squ/10;

   j++;
   //cout<<j++<<"\n";

 }

 final=sum+squ;

 if(final==input)

 {

   std::cout<<"Kaprekar Number";

 }

 else

 {

   std::cout<<"Not a Kaprekar Number";

 }

 }

}