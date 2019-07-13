You are given N integers in sorted order. Also, you are given Q  queries. In each query, you will be given an integer and you have to tell whether that integer is present in the array. If so, you have to tell at which index it is present and if it is not present, you have to tell the index at which the smallest integer that is just greater than the given number is present.

Lower bound is a function that can be used with a sorted vector. Learn how to use lower bound to solve this problem by Clicking Here.

Input Format

The first line of the input contains the number of integers N. The next line contains N integers in sorted order. The next line contains Q, the number of queries. Then Q lines follow each containing a single integer Y.

Note that if the same number is present multiple times, you have to print the first index at which it occurs. Also, the input is such that you always have an answer for each query.

Constraints


,where  is  element in the array.



Output Format

For each query you have to print "Yes" (without the quotes) if the number is present and at which index(1-based) it is present separated by a space.

If the number is not present you have to print "No" (without the quotes) followed by the index of the next smallest number just greater than that number.

You have to output each query in a new line.

Sample Input

 8
 1 1 2 2 6 9 9 15
 4
 1
 4
 9
 15
Sample Output

 Yes 1
 No 5
 Yes 6
 Yes 8




#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int length,temp;
    cin>>length;
    vector<int> v;
    while(length--){
        cin>>temp;
        v.push_back(temp);
    } 

    vector<int>::iterator bound;
    int q;
    cin>>q;
    while(q--){
        cin>>temp;
        bound  = lower_bound(v.begin(),v.end(),temp);

        if(*bound == temp)
            cout<<"Yes "<<bound-v.begin()+1<<endl;
        else
            cout<<"No "<<bound-v.begin()+1<<endl;

    }
    return 0;
}


//My Own Algo
/*
while(q--){
        cin>>temp;

        for(index=0;index<size;index++){
            if(temp == v[index]){
                cout<<"Yes "<<index+1<<endl;
                flag=1;
                break;
            }
            else{
            flag=0;
            }
        }
        if(flag==0)
        {
            int prev=0,tempi;
            for(index=0;index<size;index++)
            {
                tempi = index+1;
                if(v[index]<temp && v[tempi]>temp){
                    cout<<"No "<<tempi+1<<endl;                    
                }
            }
            flag=0;
        }
    }
*/
