

//  METHOD TWO
/* 
        boolean result = false;
        HashMap<Character, Integer> countA = new HashMap<Character,Integer>();
        HashMap<Character, Integer> countB = new HashMap<Character,Integer>();

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
 */
