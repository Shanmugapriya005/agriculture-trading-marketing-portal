import { useState } from "react";
import API from "../services/api";

function Auctions() {
  const [auctionId, setAuctionId] = useState("");
  const [amount, setAmount] = useState("");

  const bid = async () => {
    await API.post(`/auctions/${auctionId}/bid?amount=${amount}&bidder=Riya`);
    alert("Bid placed!");
  };

  return (
    <div>
      <h2>Place Bid</h2>
      <input placeholder="Auction ID" onChange={(e) => setAuctionId(e.target.value)} />
      <input placeholder="Amount" onChange={(e) => setAmount(e.target.value)} />
      <button onClick={bid}>Bid</button>
    </div>
  );
}

export default Auctions;