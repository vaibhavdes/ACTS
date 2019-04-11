#include<iostream>
#include <cstdlib>
using namespace std;

template<class T>
struct node
{
		T data;
		node<T> *next;
		node<T> *prev;
};

template <class T>
class list
{
	private:	
		node<T> *head,*tail;
		T count;
	public:
		list();
		void display();
		void insert_start();
		void insert_end();
		void insert_pos();
		void delete_start();
		//void delete_pos();
		void delete_end();
		void counts();
		
};
