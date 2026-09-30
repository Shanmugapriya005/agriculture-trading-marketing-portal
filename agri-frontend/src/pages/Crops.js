import { useEffect, useState } from "react";
import API from "../services/api";

function Crops() {
  const [crops, setCrops] = useState([]);

  useEffect(() => {
    API.get("/crops").then((res) => setCrops(res.data));
  }, []);

  return (
    <div>
      <h2>Crops</h2>
      {crops.map((crop) => (
        <div key={crop.id}>
          {crop.cropName} - ₹{crop.basePrice}
        </div>
      ))}
    </div>
  );
}

export default Crops;
