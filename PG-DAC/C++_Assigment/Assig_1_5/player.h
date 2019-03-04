#include<string>
using namespace std;
void Sort(Player *,int);		
class Player
{
	private:int age;
		string name;
		string country;
	public:	Player();	
		Player(int ,string ,string );
		void Accept();
		void Display();
};
