package de.shhn.Algorithm.hard;

public class MinimumWindowSubstring {
    public String minWindow(String s, String t) {
        int[] freq = new int[256];
        for(int i=0;i<t.length();i++){
            freq[t.charAt(i)]++;
        }

        int l=0,
                r=0,
                start = 0,
                minLen = Integer.MAX_VALUE,
                totalChar = t.length();

        while(r<s.length()){
            if(freq[s.charAt(r++)]-- > 0)
                totalChar--;

            while(totalChar == 0){
                if((r-l) < minLen){
                    start = l;
                    minLen = r-l;
                }

                if(freq[s.charAt(l++)]++ == 0)
                    totalChar++;
            }
        }

        return (minLen == Integer.MAX_VALUE ? "" : s.substring(start,start+minLen));

    }
}
