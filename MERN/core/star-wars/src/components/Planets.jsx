import { useNavigate, useParams} from "react-router-dom"
import axios from "axios";
import { useEffect,useState } from "react";


const Planets = () => {
    const {id} = useParams();
    const[planets,setPlanets]=useState([]);
    const nav=useNavigate()
   
    

    useEffect(()=>{
      axios.get(`https://swapi.dev/api/planets/${id}`)
      .then(res=>{
        console.log(res.data)
        setPlanets(res.data)
        
      
      
      })
      .catch(err=>{
        console.log(err)
        nav('/error')
      })

    },[id]);

   
      
 
   
  return (
    <div className='max-w-lg  mx-auto my-10'>
      <h1 className="text-3xl font-bold">{planets.name}</h1>
      <div className="mt-3">
      <p className="text-xl"><span className=" font-semibold ">Climate :</span> {planets.climate} cm</p>
      <p className="text-xl"><span className=" font-semibold ">Terrain :</span> {planets.terrain} </p>
      <p className="text-xl"><span className=" font-semibold ">Surface Water :</span> {planets.surface_water}</p>
      <p className="text-xl"><span className=" font-semibold ">Population :</span> {planets.population}</p>
      
    
    
      </div>
      
      
    </div>
  )
}

export default Planets