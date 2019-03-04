#include<iostream>
#include<string>
#include"Player.h"
using namespace std;
Player::Player()
{
	age=0;
	name='\0';
	country='\0';
}
Player::Player(int a,string b,string c)
{
	age=a;
	name=b;
	country=c;
}
void Player::Accept()
{
	cout<<"Enter Age, Name, Country of the Player:"<<endl;
	cin>>age>>name>>country;
}
void Player::Display()
{
	cout<<age<<"\t"<<name<<"\t"<<country<<endl;
}
void Sort(Player *p,int a)
{
	int temp_age;
	string temp;
	string temp_c;
	for(int i=0;i<a;i++)
	{
		for(int j=i+1;j<a;j++)
		{
			if(p[i].age>p[j].age || p[i].age==p[j].age)
			{
				temp_age=p[i].age;
				temp = p[i].name;
				p[i].age=p[j].age;

				p[i].name = p[j].name;
				p[j].age=temp_age;
				p[j].name = temp;

				temp_c = p[i].country;
				p[i].country = p[j].country;
				p[j].country = temp_c;
			}
		}
	}
	for(int k=0;k<a;k++)
	{
		p[k].Display();
	}
}
