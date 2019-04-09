class stack
{
	private:
		int size;
		int top;
		int *arr;

	public:
		stack();
		void create();
		void push();
		void pop();
		void peek();
		bool isFull();
		bool isEmpty();
		~stack();
};
