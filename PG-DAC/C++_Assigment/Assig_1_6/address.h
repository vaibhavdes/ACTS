#include<cstring>
using namespace std;
class Address
{
private:
	int houseNo;
	string colony;
	string area;
	string city;
	int pincode;
public:
	Address();
	Address(int,string,string,string,int);
	void accept();
	void display();
	bool operator==(Address &);
};
