Your friend set up a small computational server that performs complex calculations. 
It has a function that takes  large numbers as its input and returns a numeric result. Unfortunately, there are various exceptions that may occur during execution.

Complete the code in your editor so that it prints appropriate error messages, should anything go wrong. The expected behavior is defined as follows:

If the compute function runs fine with the given arguments, then print the result of the function call.
If it fails to allocate the memory that it needs, print Not enough memory.
If any other standard C++ exception occurs, print Exception: S where  is the exception's error message.
If any non-standard exception occurs, print Other Exception.
Input Format

The first line contains an integer, , the number of test cases. 
Each of the  subsequent lines describes a test case as  space-separated integers,  and , respectively.

Constraints

 

Output Format

For each test case, print a single line containing whichever message described in the Problem Statement above is appropriate. After all messages have been printed, the locked stub code in your editor prints the server load.

Sample Input

2
-8 5
1435434255433 5
Sample Output

Exception: A is negative
Not enough memory
2
Explanation

-8 is negative, hence 'Exception: A is negative' is thrown. Since the second input is too large, 'not enough memory' is displayed. is the server load.





#include <iostream>
#include <exception>
#include <string>
#include <stdexcept>
#include <vector>
#include <cmath>
using namespace std;

class Server {
private:
	static int load;
public:
	static int compute(long long A, long long B) {
		load += 1;
		if(A < 0) {
			throw std::invalid_argument("A is negative");
		}
		vector<int> v(A, 0);
		int real = -1, cmplx = sqrt(-1);
		if(B == 0) throw 0;
		real = (A/B)*real;
		int ans = v.at(B);
		return real + A - B*ans;
	}
	static int getLoad() {
		return load;
	}
};
int Server::load = 0;

int main() {
	int T; cin >> T;
	while(T--) {
		long long A, B;
		cin >> A >> B;

		/* Enter your code here. */
        try{
            cout<<Server::compute(A,B)<<endl;
        }
        catch(bad_alloc& error)
        {
            cout<<"Not enough memory"<<endl;
        }
        catch(exception& error)
        {
            cout<<"Exception: "<<error.what()<<endl;
        }
        catch(...)
        {
            cout<<"Other Exception"<<endl;
        }

	}
	cout << Server::getLoad() << endl;
	return 0;
}
