#include<iostream>
#include "address.h"

Address::Address()
{
houseNo = 0;
colony = '\0';
area = '\0';
city = '\0';
pincode = 0;
}

Address::Address(int h,string colony,string a,string city,int p)
{
	houseNo = h;
	this->colony = colony;
	area = a;
	this->city = city;
	pincode = p;
}
void Address::accept()
{
	cout << "\n Enter HouseNo";
    	cin >> houseNo ;
	cout << "\n Enter Colony";
        cin >> colony;
	cin.ignore();
	cout << "\n Enter Area";
        cin >> area;
	cin.ignore();
	cout << "\n Enter City";
        cin >> city;
	cin.ignore();
	cout << "\n Enter Pincode";
	cin >>  pincode;
}
void Address::display()
{
	cout << "\n" << houseNo;
	cout << "\n" << colony;
	cout << "\n" << area;
	cout << "\n" << city;
	cout << "\n" << pincode;
}
/*void Address::check()
{
	
}*/
bool Address::operator==(Address &m)
{
	if(houseNo == m.houseNo && colony == m.colony && area == m.area && city == m.city && pincode == m.pincode)
	{
		return 1;
	}
	else
	{
		return 0;
	}
	
}
