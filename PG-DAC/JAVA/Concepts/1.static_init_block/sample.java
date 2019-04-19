import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int B;
    static int H;
    static boolean flag = false;

    //This Block is Loaded only once when Class is called
    //Used as an Initializer
    //Variables are static because this static block can access only static members
    //Non-Static can access static as well non static member
    //Scanner is need to close after use
    
    static
    {
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        sc.close();
        if(B > 0 && H > 0)
            flag = true;
        else
        {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
    
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

