#include<iostream>
using namespace std;
int main()
{
  int row,col,tree;
  cin>>row;
  cin>>col;
  cin>>tree;
  if (tree <= col || tree % 5 == 0 || tree % col == 1) //Here 1st logic is for 1st column
  {													   // 2nd logic if for last column
    cout<<"Yes";										// 3rd logic is for 1st column
  }
  else
  {
    cout<<"No";
  }
  
}