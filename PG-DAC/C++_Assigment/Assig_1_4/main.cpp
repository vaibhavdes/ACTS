#include"string.h"
#include<iostream>
using namespace std;
int main()
{
      MyString s1;
      s1.accept();
      s1.display();

      MyString s2("cdac");
      s2.display();

      MyString s3(s2);
      s3.display();
}
