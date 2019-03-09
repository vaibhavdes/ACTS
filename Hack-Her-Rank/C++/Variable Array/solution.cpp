#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int row,query,data;
    int **arrname;
    cin>>row;
    cin>>query;
    arrname = new int * [row];

    for(int i = 0; i < row; i++)
    {
        cin>>data;
        arrname[i] = new int[data];
                for(int j = 0; j < data; j++)
                    cin >> arrname[i][j];
    }

    for(int i = 0; i < query; i++)
    {
        int r,c;
        cin>>r;
        cin>>c;
        cout<< arrname[r][c] << endl;
    }
    return 0;
}

