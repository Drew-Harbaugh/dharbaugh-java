package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Lucky13Tests {


    @Test
    public void returnNo_One_or_Three(){
        Lucky13 sut = new Lucky13();
        int[] array = {2, 4 ,5};
        boolean result = sut.getLucky(array);
        Assert.assertEquals(true, result);
    }


    @Test
    public void returnContains_One_or_Three(){
        Lucky13 sut = new Lucky13();
        int[] array = {1, 3, 4};
        boolean result = sut.getLucky(array);
        Assert.assertEquals(false, result);
    }



}
