import { Link, useParams, useNavigate} from "react-router-dom"
import axios from "axios";
import { useEffect,useState } from "react";


const People = () => {
    const {id} = useParams();
    const[people,setPeople]=useState([]);
    const[world,setWorld]=useState([]);
    const[url,setUrl]= useState();
    const nav=useNavigate();

    useEffect(()=>{
      axios.get(`https://swapi.dev/api/people/${id}`)
      .then(res=>{
        console.log(res.data)
        setPeople(res.data)
        const peopleWorld = res.data.homeworld;
        setUrl(peopleWorld)
       axios.get(peopleWorld)
       .then(response=>{
        console.log(response.data.name)
        setWorld(response.data)

      })
       .catch(err=>{
        console.log(err)
        nav('/error')
      })
      
      })
      .catch(err=>{
        console.log(err)
        nav('/error')
      })

    },[id]);

    const getUrlPathname = (url) => {
      if (!url) return "";
      const urlWorld = new URL(url);
      return urlWorld.pathname.replace(/^\/api\/?/, "");
    };
      
 
   
  return (
    <div className='max-w-lg  mx-auto my-10'>
      <h1 className="text-3xl font-bold">{people.name}</h1>
      <div className="mt-3">
      <p className="text-xl"><span className=" font-semibold ">Height :</span> {people.height} cm</p>
      <p className="text-xl"><span className=" font-semibold ">Mass :</span> {people.mass} kg</p>
      <p className="text-xl"><span className=" font-semibold ">Hair Color:</span> {people.hair_color} </p>
      <p className="text-xl"><span className=" font-semibold ">Skin Color :</span> {people.skin_color}</p>
      <p className="text-xl text-green-700 mt-2"><span className=" font-semibold ">Home World :</span> {world.name} <Link className="shadow bg-blue-500 hover:bg-blue-700 focus:shadow-outline focus:outline-none text-white font-bold rounded px-4 py-1" to={`/${getUrlPathname(url)}`}> +More Details</Link> </p>
   
      </div>
      
      
    </div>
  )
}

export default People