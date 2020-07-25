#include<iostream>
using namespace std;
int main()
{
    int input;
    float marks=0.0;
    for(int i=0;i<3;)//main loop for max 3 no of input
    {
        
        cin>>input;
        if(input <0)	//this is for negative mnumber
        {
            marks = marks - 1.0;
            break;
            
        }
        if (input >=0)	//for input greater than zero
        {
            if (input%2==0)	//for even input
            {
                marks = marks-0.5;
            }
            else if (input%2!=0)	//for odd input
            {
                marks = marks+1.0;
                i++;
            }
        }
        
    }
    cout<<marks<<endl;
}