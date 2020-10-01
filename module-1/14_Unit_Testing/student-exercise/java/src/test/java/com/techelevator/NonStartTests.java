package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class NonStartTests {


    @Test
    public void returnString_More_Than_Length_One(){
        NonStart sut = new NonStart();
        String result = sut.getPartialString("Millennium", "Falcon");
        Assert.assertEquals("illenniumalcon", result);
    }


    @Test
    public void returnString_A_Length_Zero(){
        NonStart sut = new NonStart();
        String result = sut.getPartialString("", "Is");
        Assert.assertEquals("s", result);
    }


    @Test
    public void returnString_B_Length_Zero(){
        NonStart sut = new NonStart();
        String result = sut.getPartialString("It", "");
        Assert.assertEquals("t", result);
    }



}
