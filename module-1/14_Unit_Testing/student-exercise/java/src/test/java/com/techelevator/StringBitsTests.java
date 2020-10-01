package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class StringBitsTests {


    @Test
    public void returnLong_String(){
        StringBits sut = new StringBits();
        String result = sut.getBits("Heeololeo");
        Assert.assertEquals("Hello", result);
    }

    @Test
    public void returnShort_String(){
        StringBits sut = new StringBits();
        String result = sut.getBits("Hi");
        Assert.assertEquals("H", result);
    }


    @Test
    public void returnNo_String(){
        StringBits sut = new StringBits();
        String result = sut.getBits("");
        Assert.assertEquals("", result);
    }




}
