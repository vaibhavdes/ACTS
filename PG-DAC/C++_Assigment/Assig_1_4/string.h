
class MyString
{
private:
	int size;
	char *p;
public:		
	MyString();
	MyString(char *);
	MyString(const MyString&);
	void accept();
	void display();
	~MyString();
};	
