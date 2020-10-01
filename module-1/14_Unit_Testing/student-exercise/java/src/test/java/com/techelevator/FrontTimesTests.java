package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class FrontTimesTests {


    @Test
    public void returnsFirstThree(){
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("Zelda" , 2);
        Assert.assertEquals("ZelZel", result);
    }


    @Test
    public void returnsFirst_If_String_Is_Less_Than_Three(){
        FrontTimes sut = new FrontTimes();
        String result = sut.generateString("It" , 2);
        Assert.assertEquals("ItIt", result);
    }





}
