struct node
{
		int data;
		node *next;
		node *prev;
};

class list
{
	private:	
		node *head,*tail;
		int count;
	public:
		list();
		void display();
		void insert_start();
		void insert_end();
		void insert_pos();
		void delete_start();
		//void delete_pos();
		void delete_end();
		void reverse_display();
		void counts();
		
};
