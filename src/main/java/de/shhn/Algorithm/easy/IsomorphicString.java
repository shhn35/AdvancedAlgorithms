package de.shhn.Algorithm.easy;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public boolean isIsomorphic(String s, String t) {
        s = s.toLowerCase();
        t = t.toLowerCase();

        char charS;
        char charT;

        if(s.length() != t.length())
            return false;

        Map<Character,Character> charMap = new HashMap<Character,Character>();

        for(int i=0;i<s.length();i++){
            charS = s.charAt(i);
            charT = t.charAt(i);

            if(charMap.containsKey(charS)){
                if(charMap.get(charS) != charT)
                    return false;
            }else{
                charMap.put(charS,charT);
            }
        }

        return true;
    }
}
