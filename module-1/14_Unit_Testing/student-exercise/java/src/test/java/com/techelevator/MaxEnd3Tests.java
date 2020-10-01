package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class MaxEnd3Tests {


    @Test
    public void returnFirst_Largest(){
        MaxEnd3 sut = new MaxEnd3();
        int[]array = {7, 5, 1};
        int[] result = sut.makeArray(array);
        Assert.assertEquals(array, result);
    }

    @Test
    public void returnThird_Largest(){
        MaxEnd3 sut = new MaxEnd3();
        int[]array = {7, 5, 9};
        int[] result = sut.makeArray(array);
        Assert.assertEquals(array, result);
    }





}
