
#include<iostream>
using namespace std;

template<class T>
class queue
{
	private:
		T front;
		T rear;
		T size;
		T *arr;

	public:
		queue();

		void create();
		void insert();
		void remove();
		void display();
		bool isFull();
		bool isEmpty();
	
		~queue();
};
