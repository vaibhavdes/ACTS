void plusMinus(vector<int> arr) {
    float x = 0;
    float y = 0;
    float z = 0;
    float i = arr.size();
    for(int j=0;j<i;j++) {
        if(arr[j]>0)
            x++;
        else if(arr[j]<0)
            y++;
        else
            z++;
    }

    cout<<setprecision (6) << fixed << x/i<<"\n";
    cout<<setprecision (6) << fixed << y/i<<"\n";
    cout<<setprecision (6) << fixed << z/i<<"\n";

}
