package com.techelevator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BidTests {

    private static final String BIDDER_NAME = "TestBidder";
    private static final int BID_AMOUNT = 100;

    private Bid sut;  //sut = System Under Test

    @Before
    public void setup(){
        sut = new Bid(BIDDER_NAME, BID_AMOUNT);
    }
// If used i have to delete my first line on every test.

    @Test
    public void getBidder_returns_bidder_name(){

//        Bid bid = new Bid("TestBidder", 1);

        String bidder = sut.getBidder();

        Assert.assertEquals(BIDDER_NAME, bidder);
    }

    @Test
    public void getBidAmount_returns_bid_amount(){

//        Bid bid = new Bid(BIDDER_NAME, BID_AMOUNT);

        int bidAmount = sut.getBidAmount();

        Assert.assertEquals(BID_AMOUNT, bidAmount);
    }


}
