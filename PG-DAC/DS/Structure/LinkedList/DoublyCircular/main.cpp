
#include "linkedlist.cpp"

int main()
{
	list<int> l;
	//l.createNode();

	int option=1;
	
	while(option!=0)
	{
		cout<<endl;
		cout<<"1. Insert Node at Start | 2. Insert Node at End | 3. Delete From Start | 4. Delete from End |  5. Display | 6. Count | 7. Insert at Pos |0. Exit"<<endl;		
	cin>>option;
		switch(option)
		{
			case 1:
				l.insert_start();
				break;
			case 2:
				l.insert_end();
				break;
			case 3: 
				l.delete_start();
				break;
			case 4: 
				l.delete_end();
				break;
			case 5:
				l.display();
				break;
			case 6:
				l.counts();
				break;
			case 7:
				l.insert_pos();
				break;
			case 0:
				exit(0);	
		}
	}
}
