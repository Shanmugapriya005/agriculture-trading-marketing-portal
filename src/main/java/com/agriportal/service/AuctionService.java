package com.agriportal.service;

import com.agriportal.model.Auction;
import com.agriportal.repository.AuctionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuctionService {

    private final AuctionRepository auctionRepository;

    public AuctionService(AuctionRepository auctionRepository) {
        this.auctionRepository = auctionRepository;
    }

    // CREATE AUCTION
    public Auction createAuction(Auction auction) {
        auction.setStatus("OPEN");
        auction.setHighestBid(0);
        return auctionRepository.save(auction);
    }

    // GET ALL
    public List<Auction> getAllAuctions() {
        return auctionRepository.findAll();
    }

    // PLACE BID
   public Auction placeBid(Long id, double bidAmount, String bidder) {

    Auction auction = auctionRepository.findById(id).orElse(null);

    if (auction == null) {
        throw new RuntimeException("Auction not found");
    }

    if (!auction.getStatus().equals("OPEN")) {
        throw new RuntimeException("Auction is closed");
    }

    if (bidAmount <= auction.getHighestBid()) {
        throw new RuntimeException("Bid must be higher than current bid");
    }

    auction.setHighestBid(bidAmount);
    auction.setHighestBidder(bidder);

    return auctionRepository.save(auction);
}

    // CLOSE AUCTION
    public Auction closeAuction(Long id) {
        Auction auction = auctionRepository.findById(id).orElse(null);

        if (auction != null) {
            auction.setStatus("CLOSED");
            return auctionRepository.save(auction);
        }
        return null;
    }
}