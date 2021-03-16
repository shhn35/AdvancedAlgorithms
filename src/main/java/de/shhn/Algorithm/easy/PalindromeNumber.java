package de.shhn.Algorithm.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0)
            return false;

        String s = String.valueOf(x);
         int l,r;
        for(int i=0;i<s.length()/2;i++){
             l = s.charAt(i);
             r = s.charAt(s.length() -i -1);
             if(l != r)
                return false;
        }

        return true;
    }
}
