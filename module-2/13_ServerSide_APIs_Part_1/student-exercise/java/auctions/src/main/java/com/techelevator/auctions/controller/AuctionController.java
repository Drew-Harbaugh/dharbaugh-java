package com.techelevator.auctions.controller;

import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class AuctionController {

    private final AuctionDAO dao;

    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }

//    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
//    public List<Auction> getAllAuctions() {
//        return dao.list();
//    }

    @RequestMapping(path = "/auctions/{id}")
    public Auction getAuction(@PathVariable int id) {
        return dao.get(id);
    }

    @RequestMapping(path = "/auctions", method = RequestMethod.POST)
    public Auction createAuction(@RequestBody Auction newAuction) {
        return dao.create(newAuction);
    }

    @RequestMapping(path = "/auctions", method = RequestMethod.GET)
    public List<Auction> searchAuctions(@RequestParam(defaultValue = "", name = "title_like") String title,
                              @RequestParam(defaultValue = "0", name = "currentBid_lte") double currentBid) {
        if (title.equals("") && currentBid != 0) {
            return dao.searchByPrice(currentBid);
        } else if (title.equals("") && currentBid == 0) {
            return dao.list();
        } else if (!title.equals("") && currentBid == 0) {
            return dao.searchByTitle(title);
        } else if (currentBid != 0 && !title.equals("")) {
            return dao.searchByTitleAndPrice(title,currentBid);
        }
        return dao.list();
    }
}




