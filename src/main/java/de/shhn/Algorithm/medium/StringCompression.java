package de.shhn.Algorithm.medium;

public class StringCompression {
    public int compressOtherApproach(char[] chars) {
        Integer counter = 0;
        char curr = chars[0];
        int index = 0;
        char[] countChar;


        if(chars.length == 1)
            return 1;

        for(int i = 0; i < chars.length; i++){
            if(chars[i] == curr)
                counter++;
            else{
                chars[index++] = curr;

                if(counter > 1){
                    countChar = counter.toString().toCharArray();
                    for(int j = 0; j<countChar.length; j++){
                        chars[index++] = countChar[j];
                    }
                }

                curr = chars[i];
                counter = 1;
            }
        }

        // for the last digit
        chars[index++] = curr;

        if(counter > 1){
            countChar = counter.toString().toCharArray();
            for(int j = 0; j<countChar.length; j++){
                chars[index++] = countChar[j];
            }
        }

        return index;
    }

    public int compress(char[] chars) {
        int counter = 0, index = 0;
        char c = chars[0];
        for(int i = 0; i<chars.length;i++){
            if(chars[i] == c)
                counter++;
            else{
                chars[index++] = c;
                c = chars[i];
                if(counter>1){
                    index = appendCount(chars,index,counter);
                    counter = 1;
                }
            }

        }

        // the last char
        chars[index++] = c;
        if(counter>1)
            index = appendCount(chars,index,counter);

        return index;
    }

    private int appendCount(char[] chars,int index,int counter){
        int d;
        while(counter>=0){
            d = counter / 10 ;
            if(d == 0){
                // it is the last digit which is the denominator
                d = counter;
                counter = -1;
            }else{
                counter = counter % 10;
            }
            chars[index++] = (char)(d+'0');
        }
        return index;
    }

}
