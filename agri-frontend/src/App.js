import { BrowserRouter, Routes, Route } from "react-router-dom";
import Login from "./pages/Login";
import Dashboard from "./pages/Dashboard";
import Crops from "./pages/Crops";
import Auctions from "./pages/Auctions";

function App() {
  return (
    <BrowserRouter>
      <Routes>
        <Route path="/" element={<Login />} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/crops" element={<Crops />} />
        <Route path="/auctions" element={<Auctions />} />
      </Routes>
    </BrowserRouter>
  );
}

export default App;