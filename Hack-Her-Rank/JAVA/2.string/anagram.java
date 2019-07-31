Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies. For example, the anagrams of CAT are CAT, ACT, TAC, TCA, ATC, and CTA.

Complete the function in the editor. If  and  are case-insensitive anagrams, print "Anagrams"; otherwise, print "Not Anagrams" instead.

Input Format

The first line contains a string denoting . 
The second line contains a string denoting .

Constraints

Strings  and  consist of English alphabetic characters.
The comparison should NOT be case sensitive.
Output Format

Print "Anagrams" if  and  are case-insensitive anagrams of each other; otherwise, print "Not Anagrams" instead.

Sample Input 0

anagram
margana
Sample Output 0

Anagrams
Explanation 0

Character	Frequency: anagram	Frequency: margana
A or a	3	3
G or g	1	1
N or n	1	1
M or m	1	1
R or r	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".

Sample Input 1

anagramm
marganaa
Sample Output 1

Not Anagrams
Explanation 1

Character	Frequency: anagramm	Frequency: marganaa
A or a	3	4
G or g	1	1
N or n	1	1
M or m	2	1
R or r	1	1
The two strings don't contain the same number of a's and m's, so we print "Not Anagrams".

Sample Input 2

Hello
hello
Sample Output 2

Anagrams
Explanation 2

Character	Frequency: Hello	Frequency: hello
E or e	1	1
H or h	1	1
L or l	2	2
O or o	1	1
The two strings contain all the same letters in the same frequencies, so we print "Anagrams".
        
        
#CODE
import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        boolean result = false;
        
        if(a == null || b == null)
                throw new IllegalArgumentException();
                
        if(a.length() != b.length())
                return result;

        java.util.HashMap<Character, Integer> countA = new java.util.HashMap<Character,Integer>();
        java.util.HashMap<Character, Integer> countB = new java.util.HashMap<Character,Integer>();

        char[] strA = a.toCharArray();
        char[] strB = b.toCharArray();

        for(char c : strA)
        {
            if(countA.containsKey(c))
            {
                countA.put(c,countA.get(c)+1);
            }
            else
            {
                countA.put(c,1);
            }
        }
        for(char c : strB)
        {
            if(countB.containsKey(c))
            {
                countB.put(c,countB.get(c)+1);
            }
            else
            {
                countB.put(c,1);
            }
        }
        for(char c: strB){
            if(countA.containsKey(c)){
                if(countA.get(c) == countB.get(c))
                {
                    result = true;
                }
                else
                {
                    result = false;
                }
            }
        }

        return result;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

//  METHOD TWO
/* 
    static boolean isAnagram(String a, String b) {
        boolean result = false;

        if(a == null || b == null)
                throw new IllegalArgumentException();
                
        if(a.length() != b.length())
                return result;
                
        HashMap<Character, Integer> countA = new HashMap<Character,Integer>();
        HashMap<Character, Integer> countB = new HashMap<Character,Integer>();

        char[] strA = a.toLowerCase().toCharArray();
        char[] strB = b.toLowerCase().toCharArray();

        for(char c : strA)              //for(int i = 0; i < a.length(); i++) : countA.put(a.charAt(i))
        {
            if(countA.containsKey(c))
            {
                countA.put(c,countA.get(c)+1);
            }
            else
            {
                countA.put(c,1);
            }
        }
        for(char c : strB)              //for(int j = 0; j < j.length(); j++) : countB.put(b.charAt(i))
        {
            if(countB.containsKey(c))
            {
                countB.put(c,countB.get(c)+1);
            }
            else
            {
                countB.put(c,1);
            }
        }
        for(char c: strB){
            if(countA.containsKey(c)){
                if(countA.get(c) == countB.get(c))
                {
                    result = true;
                }
                else
                {
                     return false;              // result = false;
                }
            }
        }

        return result;
   }
 */
