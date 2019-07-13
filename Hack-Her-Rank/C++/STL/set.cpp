Sets are a part of the C++ STL. Sets are containers that store unique elements following a specific order. Here are some of the frequently used member functions of sets:

Declaration:

set<int>s; //Creates a set of integers.
Size:

int length=s.size(); //Gives the size of the set.
Insert:

s.insert(x); //Inserts an integer x into the set s.
Erasing an element:

s.erase(val); //Erases an integer val from the set s.
Finding an element:

set<int>::iterator itr=s.find(val); //Gives the iterator to the element val if it is found otherwise returns s.end() .
Ex: set<int>::iterator itr=s.find(100); //If 100 is not present then it==s.end().
To know more about sets click Here. Coming to the problem, you will be given  queries. Each query is of one of the following three types:

  : Add an element  to the set.
  : Delete an element  from the set. (If the number  is not present in the set, then do nothing).
  : If the number  is present in the set, then print "Yes"(without quotes) else print "No"(without quotes).

Input Format

The first line of the input contains  where  is the number of queries. The next  lines contain  query each. Each query consists of two integers  and  where  is the type of the query and  is an integer.

Constraints




Output Format

For queries of type  print "Yes"(without quotes) if the number  is present in the set and if the number is not present, then print "No"(without quotes).
Each query of type  should be printed in a new line.

Sample Input

8
1 9
1 6
1 10
1 4
3 6
3 14
2 6
3 6
Sample Output

Yes
No
No




#CODE


#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;


int main() {
    set<int> s;
    int queries,y,x;
    cin>>queries;
    while(queries--)
    {
        cin>>y;
        cin>>x;

        if(y==1)
            s.insert(x);
        if(y==2)
            s.erase(x);

        if(y==3)
        {
            set<int>::iterator itr = s.find(x);

            if(itr == s.end())
                cout<<"No"<<endl;
            else
                cout<<"Yes"<<endl;
        }
    }
    return 0;
}



