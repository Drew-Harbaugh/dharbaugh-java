package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class DateFashionTests {


    @Test
    public void getATable_maybe(){
        DateFashion sut = new DateFashion();
        int result = sut.getATable(7, 5);
        Assert.assertEquals(1, result);
    }

    @Test
    public void getATable_yes(){
        DateFashion sut = new DateFashion();
        int result = sut.getATable(7, 8);
        Assert.assertEquals(2, result);
    }

    @Test
    public void getATable_no(){
        DateFashion sut = new DateFashion();
        int result = sut.getATable(1, 10);
        Assert.assertEquals(0, result);
    }





}
