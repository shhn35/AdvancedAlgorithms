package de.shhn.Algorithm.easy;

public class ReverseInterger {
    public int reverse(int x){
        /*
        x = 123
        y = 0
        y = y*10 +3
        -> 3
        -> 3*10+2 = 32
        -> 32*10+1 =321
        x= -123
        y=y*10+(-3)
        -> -3
        -> -3*10+(-2) = -32
        -> -32*10+(-1) = -321
        */

        /*
        maxVal = 32767 -> 3276
        if(maxVal/10 < result) --> overflow will happen if I add another digit -> return 0
        if(maxVal/10 == result && digit > 7)
            --> digit can only be between 1 and 7 to have a valid integer. return 0

        minVal = -32768 -> -3276
        if(maxVal/10 > result) --> overflow will happen if I add another digit -> return 0
        if(maxVal/10 == result && digit > 7)
            --> digit can only be between 1 and 7 to have a valid integer. return 0
        */

        int result = 0,digit=0;
        while(x!=0){
            digit = x % 10;
            x/=10;

            // Overflow checking
            if(Integer.MAX_VALUE / 10 < result || // for pos numbers
                    Integer.MIN_VALUE / 10 > result || // for neg numbers
                    (Integer.MAX_VALUE / 10 == result && digit>Integer.MAX_VALUE % 10) ||
                    (Integer.MIN_VALUE / 10 == result && digit<Integer.MIN_VALUE % 10))
            {
                return 0;
            }
            result = result * 10 + digit;
        }
        return result;

    }
}
