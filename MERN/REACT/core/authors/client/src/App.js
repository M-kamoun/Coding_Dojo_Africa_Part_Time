import { Routes, Route, Navigate } from "react-router-dom";
import Main from "./components/Main";
import Create from "./components/Create";
import Update from "./components/Update";
import { useEffect } from "react";
import NotFound from "./components/NotFound";

function App() {
  useEffect(() => {
    document.title = "Favorites Authors!";
  }, []);
  return (
    <div>
      <h1 className="mt-2 ms-5"> Favorites Authors</h1>
      <hr />
      <Routes>
        {/* Main Page list all Authors */}
        <Route path="/" element={<Navigate to="/authors" />} />
        <Route exact path="/authors" element={<Main />} />
        {/* Create Author */}
        <Route path="/authors/new" element={<Create />} />
        {/* Update Author */}
        <Route path="/authors/:id/edit" element={<Update />} />
        <Route path="/authors/404" element={<NotFound />} />
      </Routes>
    </div>
  );
}

export default App;
