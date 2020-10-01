package com.techelevator;

import org.junit.Assert;
import org.junit.Test;

import java.util.TreeMap;

public class CigarPartyTests {




    @Test
    public void minimum_Cigar_Count_for_Party(){
        CigarParty sut = new CigarParty();
        boolean result = sut.haveParty(45, true);
        Assert.assertEquals(true, result);
    }


    @Test
    public void maximum_Cigar_Count_for_Party_Weekday(){
        CigarParty sut = new CigarParty();
        boolean result = sut.haveParty(65, false);
        Assert.assertEquals(false, result);
    }

    @Test
    public void maximum_Cigar_Count_for_Party_Weekend(){
        CigarParty sut = new CigarParty();
        boolean result = sut.haveParty(65, true);
        Assert.assertEquals(true, result);
    }



}
