package de.shhn.Algorithm.easy;

import org.junit.Assert;
import org.junit.Test;

public class AddStringTest {
    @Test
    public void trivialTests(){
        String num1 = "0";
        String num2 = "0";
        String expected = "0";

        AddString addString = new AddString();

        Assert.assertEquals(expected,addString.addStrings(num1,num2));

        num1 = "1400";
        num2 = "100";
        expected = "1500";

        Assert.assertEquals(expected,addString.addStrings(num1,num2));
    }

}
