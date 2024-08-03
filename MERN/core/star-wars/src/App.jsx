
import { Routes,Route } from 'react-router-dom'
import FormApi from './components/FormApi'
import People from "./components/People";
import Planets from './components/Planets';
import Error from './components/Error';
import Species from './components/Species';
import Films from './components/Films';
import Vehicules from './components/Vehicles';
import Starships from './components/Starships';
import Vehicles from './components/Vehicles';


function App() {

 //"max-w-sm p-6 bg-white border border-gray-200 rounded-lg shadow dark:bg-gray-800 dark:border-gray-700">
  

  return (

      <div>
        <FormApi/>
        <div >
        <Routes>
        <Route  path='/people/:id' element={<People/>}/>
        <Route  path='/planets/:id' element={<Planets/>}/>
        <Route  path='/films/:id' element={<Films/>}/>
        <Route  path='/species/:id' element={<Species/>}/>
        <Route  path='/vehicles/:id' element={<Vehicles/>}/>
        <Route  path='/starships/:id' element={<Starships/>}/>
        <Route path='/error' element={<Error />} />
       
        </Routes>
        </div>
        
      </div>
       
 
  )}

export default App
