#include<string>

using namespace std;
class Payslip
{
private:
	int emp_no;
	string emp_name;
	int da;
	int hra;
	int basic_salary;
public:
	Payslip();
	Payslip(int e,string n,int d,int h,int b);
	void input(); //void input(int e,string n,int d,int h,int b);
	void display();
	void calculate();
	
	//~Payslip();
};
