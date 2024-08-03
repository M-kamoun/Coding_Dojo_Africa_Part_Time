import { useState,useEffect } from "react";
import { useNavigate } from "react-router-dom";
import axios from "axios";




const FormApi = () => {

 

    const navigate =useNavigate();

    const [listItem, setListItem] = useState([]);

    useEffect(()=>{
        axios.get(`https://swapi.dev/api`)
        .then(res=>{
         const keys= Object.keys(res.data)
        setListItem(keys)
        setSearch(keys[0])
        
          
        
        
        })
        .catch(err=>{
          console.log(err)
         
        })
  
      },[]);



    const [search,setSearch]=useState(listItem[0]);
    const [id,setId]=useState(null);

   

    const handleData = (e) => {
        e.preventDefault();
        navigate(`/${search}/${id}`);
          
      };
    
  return (
    <form onSubmit={handleData}>
<div className="mt-20 flex justify-center items-center">
<label className="mr-4 font-semibold text-lg ">Search for : </label>
<select className="bg-gray-100 mr-4 w-40 py-3 px-4 border border-grey-300 rounded outline-none " value={search} onChange={e => setSearch(e.target.value)}>
                {listItem.map( (item, index) => 
                    <option  key={index} value={item}>{item}</option>
                )}
</select>
<label className="mr-4 font-semibold text-lg ">ID : </label>
<input className="border border-gray bg-gray-100 mr-4 py-3 px-4 rounded" type="number" onChange={e => setId(e.target.value)} />
<button className="shadow bg-blue-500 hover:bg-blue-700 focus:shadow-outline focus:outline-none text-white font-bold rounded px-4 py-2" type="submit" >Search</button>
</div>
    </form>
    
  )
}

export default FormApi;