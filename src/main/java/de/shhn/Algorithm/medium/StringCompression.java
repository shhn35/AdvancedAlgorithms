package de.shhn.Algorithm.medium;

public class StringCompression {
    public int compress(char[] chars) {
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
}
