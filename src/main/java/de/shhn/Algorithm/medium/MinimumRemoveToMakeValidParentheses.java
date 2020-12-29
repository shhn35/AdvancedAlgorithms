package de.shhn.Algorithm.medium;

import java.util.Stack;

public class MinimumRemoveToMakeValidParentheses {
    public String minRemoveToMakeValid(String input) {
        Stack<Integer> parans = new Stack<>();
        int openParanIndex = -1;
        String out = "";
        char[] chars = input.toCharArray();

        for(int i = 0; i<chars.length; i++){
            if(chars[i] == '('){
                parans.push(out.length());
            }
            else if(chars[i] == ')'){
                if(!parans.isEmpty()) {
                    openParanIndex = parans.pop();
                    out = insertAtIndex(out, "(", openParanIndex);
                    out = out + chars[i];
                }
            }
            else{
                out = out + chars[i];
            }
        }
        return out;
    }

    private String insertAtIndex(String s1, String s2, int index){
        return s1.substring(0,index) + s2 + s1.substring(index,s1.length());
    }
}
