
import CreateProduct from "./components/CreateProduct";


import { Routes, Route,Navigate} from "react-router-dom"


import ListProduct from "./components/ListProduct";
import OneProduct from "./components/OneProduct";
function App() {
  return (
    <div >
     
<Routes>
<Route path='/' element={ <Navigate to="/products" /> }/>
<Route path='/products' element={<CreateProduct />} />
<Route path='/products/list' element={<ListProduct/>} />
<Route path='/products/:id' element={<OneProduct />} />


</Routes>

    </div>
  );
}

export default App;
