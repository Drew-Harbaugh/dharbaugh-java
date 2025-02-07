package com.techelevator.auction;

import java.net.IDN;
import java.util.Scanner;

import org.springframework.web.client.RestTemplate;

public class App {

    private static final String API_URL = "http://localhost:3000/auctions";
    private final RestTemplate restTemplate;
    private final Scanner scanner;

    public static void main(String[] args) {
        App app = new App(new RestTemplate(), new Scanner(System.in));
        app.run();
    }

    public App(RestTemplate restTemplate, Scanner scanner) {
        this.restTemplate = restTemplate;
        this.scanner = scanner;
    }

    public Auction[] listAllAuctions() {
        Auction[] auction = restTemplate.getForObject(API_URL, Auction[].class);
        return auction;
    }


    public Auction listDetailsForAuction() {
        System.out.print("Please choose an option: ");
        int scan = 0;
        try{
            scan = Integer.parseInt(scanner.nextLine());
            Auction auction = restTemplate.getForObject(API_URL + "/" + scan, Auction.class);
            return auction;
        } catch (NumberFormatException exception){
            return null;
        }
    }




    public Auction[] findAuctionsSearchTitle() {
        try {
            System.out.println("Please pick auction by price: ");
            String scan = scanner.nextLine();
            Auction[] auctionTitle = restTemplate.getForObject(API_URL + "?title_like=" + scan, Auction[].class);
            return auctionTitle;
        } catch (NumberFormatException exception) {
            return null;
        }
    }



    public Auction[] findAuctionsSearchPrice() {
        double scan = 0;
        try{
            System.out.println("Please pick auction by price: ");
            scan = Double.parseDouble(scanner.nextLine());
            Auction[] auctionPrice = restTemplate.getForObject(API_URL + "?currentBid_lte=" + scan, Auction[].class);
            return auctionPrice;
        } catch (NumberFormatException exception){
            return null;
        }
    }

    private void run() {
        boolean running = true;
        while (running) {
            printGreeting();
            int menuSelection = 0;
            try {
                menuSelection = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException exception) {
                System.out.println("Error parsing the input for menu selection.");
            }
            System.out.println();
            if (menuSelection == 1) {
                printAuctions(listAllAuctions());
            } else if (menuSelection == 2) {
                printAuction(listDetailsForAuction());
            } else if (menuSelection == 3) {
                printAuctions(findAuctionsSearchTitle());
            } else if (menuSelection == 4) {
                printAuctions(findAuctionsSearchPrice());
            } else if (menuSelection == 5) {
                System.out.println("Thanks for browsing the auctions... Goodbye!");
                running = false;
            } else {
                System.out.println("Invalid Selection");
            }
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }

    private void printGreeting() {
        System.out.println();
        System.out.println("Welcome to Online Auctions! Please make a selection: ");
        System.out.println("1: List all auctions");
        System.out.println("2: List details for specific auction");
        System.out.println("3: Find auctions with a specific term in the title");
        System.out.println("4: Find auctions below a specified price");
        System.out.println("5: Exit");
        System.out.println();
        System.out.print("Please choose an option: ");
    }

    private void printAuctions(Auction[] auctions) {
        if (auctions != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auctions");
            System.out.println("--------------------------------------------");
            for (Auction auction : auctions) {
                System.out.println(auction.currentBidToString());
            }
        }
    }

    private void printAuction(Auction auction) {
        if (auction != null) {
            System.out.println("--------------------------------------------");
            System.out.println("Auction Details");
            System.out.println("--------------------------------------------");
            System.out.println("Id: " + auction.getId());
            System.out.println("Title: " + auction.getTitle());
            System.out.println("Description: " + auction.getDescription());
            System.out.println("User: " + auction.getUser());
            System.out.println("Current Bid: " + auction.getCurrentBid());
            System.out.println();
        }
    }

}
