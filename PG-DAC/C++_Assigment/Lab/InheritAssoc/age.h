#include <string>
using namespace std;
class Student
{
	private:
		char *name;
		int rollno;
		string school;
	public:
		Student();
		Student(char *,int,string);
//		virtual void Display();
		void Display();
		~Student();
		
};

//class Basic : public Student		//Inheritance
class Basic 
{
	private:
		int weight;
		int height;

		Student s;		//Association
	public:
		Basic();
		Basic(int,int,char*,int, string);
		Basic(const Basic &);
		Basic(Basic *);
		void Display();
		~Basic();
		
};
