package com.techelevator;

public class BuyoutAuction extends Auction{

    private int buyoutPrice;

    public BuyoutAuction(String itemForSale, int buyoutPrice){
        super(itemForSale);
        this.buyoutPrice = buyoutPrice;
    }

    private boolean isAuctionOver(){
        Bid winningBid = super.getHighBid();
        return winningBid.getBidAmount() >= buyoutPrice;
    }

    @Override
    public boolean placeBid(Bid offeredBid){
        boolean isCuurentWinningBid = false;

        if(!isAuctionOver()){
            isCuurentWinningBid = super.placeBid(offeredBid);
        }

        return isCuurentWinningBid;
    }


}
