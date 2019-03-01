#include<iostream>
#include"Player.h"
#include<string>
using namespace std;
int main()
{
	//Player p1;
	//p1.Accept();
	//p1.Display();
	Player p[3];
	for(int i=0;i<3;i++)
	{
		p[i].Accept();
	}  
	cout<<"Age\t"<<"Name\t"<<"Country"<<endl;
  
	for(int j=0;j<3;j++)
	{
		p[j].Display();
	}	
	cout<<"Age\t"<<"Name\t"<<"Country"<<endl;
  
	Player::Sort(p,3);
  
	return 0;
}
