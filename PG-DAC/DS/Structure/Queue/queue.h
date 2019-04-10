class queue
{
	private:
		int front;
		int rear;
		int size;
		int *arr;

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
