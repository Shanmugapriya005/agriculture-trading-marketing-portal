package com.agriportal.controller;

import com.agriportal.model.Auction;
import com.agriportal.service.AuctionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auctions")
public class AuctionController {

    private final AuctionService auctionService;

    public AuctionController(AuctionService auctionService) {
        this.auctionService = auctionService;
    }

    // CREATE AUCTION
    @PostMapping
    public Auction createAuction(@RequestBody Auction auction) {
        return auctionService.createAuction(auction);
    }

    // GET ALL
    @GetMapping
    public List<Auction> getAllAuctions() {
        return auctionService.getAllAuctions();
    }

    // PLACE BID
    @PostMapping("/{id}/bid")
    public Auction placeBid(@PathVariable Long id,
                            @RequestParam double amount,
                            @RequestParam String bidder) {
        return auctionService.placeBid(id, amount, bidder);
    }

    // CLOSE AUCTION
    @PutMapping("/{id}/close")
    public Auction closeAuction(@PathVariable Long id) {
        return auctionService.closeAuction(id);
    }
}