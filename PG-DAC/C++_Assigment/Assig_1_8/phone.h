#include<iostream>
#include<string>
using namespace std;

class Phone
{
private:
	int modelNo;
	int price;
	string manufacturer;
	int quantity;
public:
	Phone();
	Phone(int m,int p,string mF, int q);
	void Accept();
	void Display();
	void Search(int model);

	void Add(int m,int p,string mF, int q,Phone []);
	void List(Phone [],int size);
	void Qty(Phone[],int m,int size);
	void Avl(Phone[],int m,int size);

};
