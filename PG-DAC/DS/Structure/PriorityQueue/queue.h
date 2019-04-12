struct pqueue
{
	int data;
	int priority;
};

class queue
{
	private:
		int count;	//rear
		int size;
		struct pqueue *arr;

	public:
		queue();

		void create();
		void insert();
		void remove_max();
		void display();
		bool isFull();
		bool isEmpty();
		~queue();
};
