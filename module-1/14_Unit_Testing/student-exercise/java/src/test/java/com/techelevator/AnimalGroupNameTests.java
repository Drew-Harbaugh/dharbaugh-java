package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

public class AnimalGroupNameTests {


    @Test
    public void getHerd_for_giraffe_returns_tower(){
        AnimalGroupName sut = new AnimalGroupName();
        String result = sut.getHerd("giraffe");
        Assert.assertEquals("Tower", result);
    }

    @Test
    public void getHerd_for_honeyBadger_returns_unknown(){
        AnimalGroupName sut = new AnimalGroupName();
        String result = sut.getHerd("honeyBadger");
        Assert.assertEquals("unknown", result);
    }

    @Test
    public void getHerd_for_null_returns_unknown(){
        AnimalGroupName sut = new AnimalGroupName();
        String result = sut.getHerd(null);
        Assert.assertEquals("unknown", result);
    }




}
