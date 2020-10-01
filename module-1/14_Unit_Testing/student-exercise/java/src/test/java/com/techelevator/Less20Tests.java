package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class Less20Tests {



    @Test
    public void returnTrue() {
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(39);
        Assert.assertEquals(true, result);
    }

    @Test
    public void returnFalse() {
        Less20 sut = new Less20();
        boolean result = sut.isLessThanMultipleOf20(37);
        Assert.assertEquals(false, result);
    }



}
