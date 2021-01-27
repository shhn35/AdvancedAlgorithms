package de.shhn.Algorithm.easy;

public class AddString {
    public String addStrings(String num1, String num2) {
        int l1 = num1.length();
        int l2 = num2.length();
        int[] sum = new int[Math.max(l1,l2)];
        int c = 0,d1 = 0,d2 = 0,s;
        for(int i = 0 ;i< sum.length; i++){
            d1 = l1 - i - 1 >=0 ? num1.charAt(l1-i-1) - '0' : 0;
            d2 = l2 - i - 1 >=0 ? num2.charAt(l2-i-1) - '0' : 0;
            s = d1 + d2 + c;
            c = s / 10;
            sum[sum.length - i - 1] = s % 10;
        }

        StringBuilder sb = new StringBuilder();
        if(c == 1)
            sb.append(1);
        for(int i = 0; i<sum.length;i++){
            sb.append(sum[i]);
        }
        return sb.toString();
    }
}
