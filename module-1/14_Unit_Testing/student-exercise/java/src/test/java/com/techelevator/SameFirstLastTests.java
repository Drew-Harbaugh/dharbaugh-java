package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class SameFirstLastTests {


    @Test
    public void returnTrue() {
        SameFirstLast sut = new SameFirstLast();
        int[] array = {1,3,4,1};
        boolean result = sut.isItTheSame(array);
        Assert.assertEquals(true, result);
    }

    @Test
    public void returnFalse() {
        SameFirstLast sut = new SameFirstLast();
        int[] array = {1,3,4,5};
        boolean result = sut.isItTheSame(array);
        Assert.assertEquals(false, result);
    }

    @Test
    public void returnFalse_Length_Zero() {
        SameFirstLast sut = new SameFirstLast();
        int[] array = {};
        boolean result = sut.isItTheSame(array);
        Assert.assertEquals(false, result);
    }



}
