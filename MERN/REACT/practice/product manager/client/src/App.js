
import CreateProduct from "./components/CreateProduct";


import { Routes, Route,Navigate} from "react-router-dom"


import ListProduct from "./components/ListProduct";
import OneProduct from "./components/OneProduct";
import UpdateProduct from "./components/UpdateProduct";
function App() {
  return (
    <div >
     
<Routes>
<Route path='/' element={ <Navigate to="/products" /> }/>
<Route path='/products' element={<CreateProduct />} />
<Route path='/products/list' element={<ListProduct/>} />
<Route path='/products/:id' element={<OneProduct />} />
<Route path='/products/:id/update' element={<UpdateProduct />} />


</Routes>

    </div>
  );
}

export default App;
