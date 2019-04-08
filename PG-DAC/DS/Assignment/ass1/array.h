

class stack
{
	private:
		int size;
		int top;
		int *arr;

	public:
		stack();
		void insert(int element,int position);
		void remove(int position);
		void display(); 		
		void create(int size);
		void min();
		void max();
		bool isFull();
		bool isEmpty();

		void move(int pos);
		void search(int element);
		void count();
		void avg();
		void duplicate();
		void reverse();
};
