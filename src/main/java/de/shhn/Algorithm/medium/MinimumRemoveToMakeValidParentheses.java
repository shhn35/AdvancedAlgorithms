package de.shhn.Algorithm.medium;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String s) {
        char[] validS = new char[s.length()];
        int index = 0;
        char c;
        Deque<Integer> openParan = new ArrayDeque<Integer>();

        for(int i=0;i<s.length();i++){
            c = s.charAt(i);
            if(c == '('){
                openParan.push(index++);

            }else if(c == ')'){
                if(openParan.size()>0){
                    validS[index++] = c;
                    validS[openParan.pop()] = '(';
                }
            }else{
                validS[index++] = c;
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            if(validS[i] != '\u0000')
                sb.append(validS[i]);
        }

        return sb.toString();
    }
}
