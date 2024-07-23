

import { useState } from "react"
import Display from "./components/Display"
import Form from "./components/Form"


function App() {
  const[box,setBox]=useState([]);
  
const addBox = (value)=>{
 
setBox([...box,value])
}

  return (
    <>

    <Form addBox={addBox}/>
    <div style={{display:"flex"}}>
    {box.map((item,i)=>{
      return <Display key={i} color={item.color} size={item.size}/>
    })}

    
    </div>
    
    
   
  
  </>
    
  
  )
}

export default App
