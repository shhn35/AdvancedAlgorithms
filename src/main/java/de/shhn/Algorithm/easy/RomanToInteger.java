package de.shhn.Algorithm.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private Map<Character,Integer> map ;

    RomanToInteger(){
        map =  new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
    }

    public int romanToInt(String s) {
        int accSum = map.get(s.charAt(0));
        int result = 0;

        for(int i =1;i<s.length();i++){
            if(map.get(s.charAt(i)) < map.get(s.charAt(i-1))){
                result += accSum;
                accSum = map.get(s.charAt(i));;
            }
            else if(map.get(s.charAt(i)) > map.get(s.charAt(i-1)))
                accSum = map.get(s.charAt(i)) - accSum;
            else
                accSum += map.get(s.charAt(i));
        }

        result += accSum;

        return result;

    }
}
