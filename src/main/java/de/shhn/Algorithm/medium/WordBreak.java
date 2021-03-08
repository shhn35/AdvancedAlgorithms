package de.shhn.Algorithm.medium;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordBreak {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String,Boolean> dict = new HashMap<>();

        for(int i=0;i<wordDict.size();i++){
            dict.put(wordDict.get(i),true);
        }

        boolean result = false;
        char[] subWord = new char[s.length()];

        int charIndex = 0;

        for(int i =0;i<s.length();i++){
            subWord[charIndex++] = s.charAt(i);

            if (wordFoundInDict(subWord,charIndex,dict)){
                result = true;
                charIndex = 0;
            }else{
                result = false;
            }
        }

        return result;

    }

    private boolean wordFoundInDict(char[] word,int wordLen,Map<String,Boolean> dict){
        String w = new String(word,0,wordLen);
        if(dict.containsKey(w))
            return true;
        else
            return false;
    }
}
