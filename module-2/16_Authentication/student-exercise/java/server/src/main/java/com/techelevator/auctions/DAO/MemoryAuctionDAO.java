package com.techelevator.auctions.DAO;

import com.techelevator.auctions.exception.AuctionNotFoundException;
import com.techelevator.auctions.model.Auction;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component
public class MemoryAuctionDAO implements AuctionDAO {

    private final List<Auction> auctions = setupAuctions();

    @Override
    public List<Auction> list() {
        return auctions;
    }

    @Override
    public Auction get(int id) throws AuctionNotFoundException {
        for(Auction auction : auctions) {
            if(auction.getId() == id) {
                return auction;
            }
        }

        throw new AuctionNotFoundException();
    }

    @Override
    public Auction create(Auction auction) {
        auction.setId(getMaxIdPlusOne());
        auctions.add(auction);
        return auction;
    }

    @Override
    public List<Auction> searchByTitle(String searchTerm) {
        List<Auction> matchTitles = new ArrayList<>();
        for(Auction auction : auctions) {
            if(auction.getTitle().toLowerCase().contains(searchTerm.toLowerCase())) {
                matchTitles.add(auction);
            }
        }
        return matchTitles;
    }

    @Override
    public List<Auction> searchByPrice(double maxPrice) {
        List<Auction> matchPrices = new ArrayList<>();
        for(Auction auction : auctions) {
            if(auction.getCurrentBid() <= maxPrice) {
                matchPrices.add(auction);
            }
        }
        return matchPrices;
    }

    @Override
    public Auction update(Auction auction, int id) throws AuctionNotFoundException {
        Auction result = auction;
        boolean finished = false;
        List<Auction> auctions = list();

        for (int i = 0; i < auctions.size(); i++) {
            if (auctions.get(i).getId() == id) {
                // the auction id doesn't need to be passed with the auction object
                // but if it is lets handle that
                if( result.getId() == 0 ) {
                    result.setId(id);
                }
                auctions.set(i, result);
                finished = true;
                break;
            }
        }
        if (!finished) {
            throw new AuctionNotFoundException();
        }

        return result;
    }

    @Override
    public void delete(int id) throws AuctionNotFoundException {
        Auction target = null;
        for(Auction auction : auctions) {
            if(auction.getId() == id) {
                target = auction;
                break;
            }
        }
        if(target == null) {
            throw new AuctionNotFoundException();
        } else {
            auctions.remove(target);
        }
    }

    private List<Auction> setupAuctions() {
        List<Auction> result = new ArrayList<>();
        result.add(new Auction(1,
                "Bell Computer Monitor",
                "4K LCD monitor from Bell Computers, HDMI & DisplayPort",
                "Queenie34",
                100.39));
        result.add(new Auction(2,
                "Pineapple Smart Watch",
                "Pears with Pineapple ePhone",
                "Miller.Fahey",
                377.44));
        result.add(new Auction(3,
                "Mad-dog Sneakers",
                "Soles check. Laces check.",
                "Cierra_Pagac",
                125.23));
        result.add(new Auction(4,
                "Annie Sunglasses",
                "Keep the sun from blinding you",
                "Sallie_Kerluke4",
                69.67));
        result.add(new Auction(5,
                "Byson Vacuum",
                "Clean your house with a spherical vacuum",
                "Lisette_Crist",
                287.73));
        result.add(new Auction(6,
                "Fony Headphones",
                "Listen to music, movies, games and not bother people around you",
                "Chester67",
                267.38));
        result.add(new Auction(7,
                "Molex Gold Watch",
                "Definitely not fake gold watch",
                "Stuart27",
                188.39));
        return result;
    }

    /**
     * finds the max id in the list of auctions and returns it
     *
     * @return int the max id
     */
    private int getMaxID() {
        int maxID = 0;
        for (Auction auction : auctions) {
            if (auction.getId() > maxID) {
                maxID = auction.getId();
            }
        }
        return maxID;
    }

    /**
     * Adds 1 to the max id and returns it
     *
     * @return
     */
    private int getMaxIdPlusOne() {
        return getMaxID() + 1;
    }

}
