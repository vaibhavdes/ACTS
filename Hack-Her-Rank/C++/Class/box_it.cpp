/*
Design a class named Box whose dimensions are integers and private to the class. The dimensions are labelled: length , breadth , and height .
The default constructor of the class should initialize , , and  to .
The parameterized constructor Box(int length, int breadth, int height) should initialize Box's  and  to length, breadth and height.
The copy constructor BoxBox ) should set  and  to 's  and , respectively.

Apart from the above, the class should have  functions:

int getLength() - Return box's length
int getBreadth() - Return box's breadth
int getHeight() - Return box's height
long long CalculateVolume() - Return the volume of the box
Overload the operator  for the class Box. Box   Box  if:
A.l<B.l 
A.b < B.b and A.l==B.l
A.h < B.h  and A.b==B.b and A.l==B.l

Overload operator <<  for the class Box(). 
If B is an object of class Box:
cout << B should print B.l,B.b and B.h on a single line separated by spaces.
 
Two boxes being compared using the < operator will not have all three dimensions equal.
*/


#include<bits/stdc++.h>

using namespace std;
//Implement the class Box  
class Box{
//l,b,h are integers representing the dimensions of the box
    private:
    int l;
    int b;
    int h;
// The class should have the following functions : 
    public:
// Constructors: 
// Box();
    Box()
    {
        l = 0;
        b = 0;
        h = 0;
    }
// Box(int,int,int);
    Box(int i,int j,int k):l(i),b(j),h(k)
    {

    }
// Box(Box);
    Box(const Box &c)
    {
        l = c.l;
        h = c.h;
        b = c.b;
    }

// int getLength(); // Return box's length
    int getLenght()
    {
        return l;
    }
// int getBreadth (); // Return box's breadth
    int getBreadth()
    {
        return b;
    }
// int getHeight ();  //Return box's height
    int getHeight()
    {
        return h;
    }
// long long CalculateVolume(); // Return the volume of the box
    long long CalculateVolume()
    {
        return (long)l * b * h;
    }
//Overload operator < as specified
//bool operator<(Box& b)
    bool operator<(Box &c)
    {
        if((l<c.l) || (b < c.b && l==c.l) || (h<c.h && b==c.b && l==c.l))
            return 1;
        else
            return 0;
    }   
//Overload operator << as specified
//ostream& operator<<(ostream& out, Box& B)
    friend ostream &operator<<(ostream& out, Box& B);
};

   ostream &operator<<(ostream& out, Box& B)
   {
       out<< B.l << " " << B.b << " " << B.h;
       return out;
   }
