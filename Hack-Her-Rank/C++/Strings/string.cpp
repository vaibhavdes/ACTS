/*
Sample Input
abcd
ef

Sample Output
4 2
abcdef
ebcd af

Explanation
 "abcd"
 "ef"
 "abcdef"
 "ebcd"
 "af"
 */
 
 
 //Solution
 #include <iostream>
#include <string>
using namespace std;

int main() {
	// Complete the program
    string s1,s2;
    cin>>s1;
    cin>>s2;

    cout<<s1.size()<<" "<<s2.size()<<endl;
    cout<<s1+s2<<endl;
    
    for(int i=0;i<s1.size();i++)
    {
        if(i==0)
            cout<<s2[i];
        else
            cout<<s1[i];
    }
    cout<<" ";
    for(int i = 0; i<s2.size();i++)
    {
        if(i==0)
            cout<<s1[i];
        else
            cout<<s2[i];
    }
    return 0;
}

