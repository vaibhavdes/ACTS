// Special Contribution by Kirtish, Sushant 

#include<iostream>
#include<string.h>
#include<ctime>
using namespace std;

static int count;

struct emp
{
	int empid;
	string empname;
	int salary;
	int doj;
};

void accept(emp *e1,int employ)
{
	int i=0;
	for(i=0;i<employ;i++)
	{
		cout<<"enter empid\n"<<endl;
		cin>>e1[i].empid;
		cout<<"enter empname\n"<<endl;
		cin>>e1[i].empname;
		cout<<"enter Salary\n"<<endl;
		cin>>e1[i].salary;
		cout<<"enter joining date\n"<<endl;
		cin>>e1[i].doj;
			
		count++;
	}

}
void display(emp *e1)
{
	int i=0;
	for(i=0;i<count;i++)
	{
		cout<<"\nempid\n"<<e1[i].empid<<endl;
		cout<<"\nempname\n"<<e1[i].empname<<endl;
		cout<<"\nempid\n"<<e1[i].salary<<endl;
		cout<<"\njoining date\n"<<e1[i].doj<<endl;
		cout<<endl<<endl;
	}
}
void avg(emp *e1)
{
	int temp=0,i;
	for(i=0;i<count;i++)
	{
		temp = temp + e1[i].salary;
	}
	cout<<"Average is "<<temp/count<<endl;
}
void max(emp *e1)
{
	int max=0,i;
	for(i=0;i<count;i++)
	{
		if(e1[i].salary > max)
		{
			max = e1[i].salary;
		}
	}
	cout<<"max is "<<max<<endl;
}
void min(emp *e1)
{
	int min=99999,i;
	for(i=0;i<count;i++)
	{
		if(e1[i].salary < min)
		{
			min = e1[i].salary;
		}
	}
	cout<<"min is "<<min<<endl;
}
void total(emp *e1)
{
	int total=0,i;
	for(i=0;i<count;i++)
	{
			total = total + e1[i].salary;
	}
	cout<<"total is "<<total<<endl;
}
int expFun(emp *e1,int e) {
	time_t t = time(NULL);
	tm* timePtr = localtime(&t);
	int year;
	year = timePtr->tm_year + 1900;
	int exp;
	exp = year - e1[e].doj;
	//cout<<exp<<" years"<<endl;
	return exp;
}
void minexp(emp *e1)
{
	int exp = expFun(e1,0),i;
	string temp;
	for(i=1;i<count;i++)
	{
		if(expFun(e1,i) < exp)
		{
			exp = expFun(e1,i);
			temp = e1[i].empid;
		}	
	}
	cout<<"min exp is "<<exp<<" of"<<temp<<endl;
}
void maxexp(emp *e1)
{
	int exp = expFun(e1,0),i;
	string temp;
	for(i=1;i<count;i++)
	{
		if(expFun(e1,i) > exp)
		{
			exp = expFun(e1,i);
			temp = e1[i].empid;
		}	
	}
	cout<<"max exp is "<<exp<<" of"<<temp<<endl;
}


int main()
{
	int size;
	int option = 1;
	int employ;
	cout<<"Enter Number of Employees "<<endl;
	cin>>size;
	
	emp *e1;
	e1 = new emp[size];
	
	
	while(option!=0)
	{
		cout<<"MENU\n";
		cout<<"1. accept Element\n";
		cout<<"2. Display Element\n";
		cout<<"3. find total\n";
		cout<<"4. find max\n";
		cout<<"5. find min\n";
		cout<<"6. find avg\n";
		cout<<"7. find max exp\n";
		cout<<"8. find min exp\n";
		cin>>option;
		switch(option)
		{
			case 1:	
				accept(e1,size);
				break;
	
			case 2:	
				display(e1);
				break;
		
			case 3:	
				total(e1);
				break;
			case 4:	
				max(e1);
				break;
			case 5:	
				min(e1);
				break;
			case 6:	
				avg(e1);
				break;
			case 7:
				maxexp(e1);
				break;
			case 8:
				minexp(e1);
				break;
			default:cout<<"wrong choise\n";
	
	
		
		}
	}
	
	
	
}
