
import PersonForm from "./components/PersonForm";
import Main from "./Main";
import { Routes, Route, Link } from "react-router-dom"
function App() {
  return (
    <div className="App">
     
<Routes>

<Route path='/' element={<Main />} />



</Routes>

    </div>
  );
}

export default App;
