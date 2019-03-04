
#include <iostream>
using namespace std;
class Time
{
//By default everything is private
private:
		int hour;
		int minute;
		int second;
public:
		Time()
		{
			hour = 0;
			minute = 0;
			second = 0;
		}
		Time(int h,int m,int s)
		{
			hour = h;
			minute = m;
			second = s;
		}
		void show()
		{
			cout<<"Hour "<<hour<<endl;
			cout<<"Minute "<<minute<<endl;
			cout<<"Second "<<second<<endl;
		}
		void compare(Time t1,Time t2)
		{
			if(t1.hour == t2.hour)
			{	if((t1.minute) == (t2.minute))
				{	if(t1.second == t2.second)
					{
						cout<<"Time is Matching";
					}
				}
			}
			else
			{
				cout<<"Time is not matching";
			}
		}
		void different(Time t1,Time t2)
		{
			int h,m,s,t;
			h = (t2.hour - t1.hour)*3600;
			m = (t2.minute - t1.minute)*60;
			s = t2.second - t1.second;
			t = h + m + s;
			
     			//For this Time Difference Formula, Ref StackOverflow
      			cout<<"\nDifference: Hour "<<t/3600<<" Minute "<<(t%3600)/60<<" Second "<<s%60;      
		}
		//~Time();

};
int main() {

	Time t1;
	t1.show();

	Time t2(12,25,45);
	t2.show();

	Time t3;
	t3.compare(t1,t2);

	t3.different(t1,t2);
	
	return 0;
}
