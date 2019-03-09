/*

Input Format

Input will consist of four lines. 
The first line will contain an integer, representing age. 
The second line will contain a string, consisting of lower-case Latin characters ('a'-'z'), representing the first_name of a student. 
The third line will contain another string, consisting of lower-case Latin characters ('a'-'z'), representing the last_name of a student. 
The fourth line will contain an integer, representing the standard of student.

Note: The number of characters in first_name and last_name will not exceed 50.

Output Format

Output will be of a single line, consisting of age, first_name, last_name and standard, each separated by one white space.

P.S.: I/O will be handled by HackerRank.

Sample Input

15
john
carmack
10
Sample Output

15 john carmack 10
*/


//Solution

#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

/*
    add code for struct here.
*/
struct Student
{
    int age;
//    char first_name[100];
//    char last_name[100];
    string first_name;
    string last_name;
    int standard;
};

int main() {
    Student st;
    
    cin >> st.age >> st.first_name >> st.last_name >> st.standard;
    cout << st.age << " " << st.first_name << " " << st.last_name << " " << st.standard;
    
    return 0;
}

