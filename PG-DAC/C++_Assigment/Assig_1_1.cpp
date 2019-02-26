//Assignment_1 Que_1

#include <iostream>
using namespace std;
class Student
{
//By default everything is private
private:
		int rollno;
		string name;
		string course;
public:
		Student()
		{
			rollno = 0;
		}
		Student(int r,string name,string c)
		{
			rollno = r;
			this->name = name;
			course = c;
		}
		void accept(int r,string n,string c)
		{
			rollno = r;
			name = n;
			course = c;
		}
		void show()
		{
			cout<<"Roll No "<<rollno<<endl;
			cout<<"Name "<<name<<endl;
			cout<<"Course "<<course<<endl;
		}
		void search(int r,Student s[])
		{
			int i;
			for(i = 0; i < 10; i++)
			{
				if(s[i].rollno == r)
					cout<<"Name "<<s[i].name<<"Course "<<s[i].course;
			}
		}
		//~Student(); //Otherwise it will end the show before starting

};
void search(int r,Student s[]);
int main() {

	Student s1;
	Student s2(23,"Arjun","PG-DAC");
	Student s3[10];

	string name,cou;
	int rollno;

	cout<<"Enter Name"<<endl;
	cin>>name;
	cout<<"Enter Course"<<endl;
	cin>>cou;
	cout<<"Enter Roll"<<endl;
	cin>>rollno;

	s1.accept(rollno,name,cou);
	s1.show();
	s2.show();

	int i;
	for(i = 0; i < 2; i++)
	{
		cout<<"Enter Name"<<endl;
		cin>>name;
		cout<<"Enter Course"<<endl;
		cin>>cou;
		cout<<"Enter Roll"<<endl;
		cin>>rollno;

		s3[i].accept(rollno,name,cou);
	}

	int s;
	cout<<"Enter Roll Number to Search";
	cin>>s;
	s1.search(s,s3);


	return 0;
}

