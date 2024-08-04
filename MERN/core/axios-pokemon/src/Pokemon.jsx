import axios from "axios"
import { useState } from "react"

const Pokemon = () => {

    const [pokemon, setPokemon] = useState(null)
    const[error,setError]=useState('')
    const[loading,setLoading]=useState(false)

    const fetchPokemon = ()=>{
        setLoading(true)
        axios.get("https://pokeapi.co/api/v2/pokemon?limit=807")
        .then(res=>{ 
            console.log(res.data)
            setPokemon(res.data)
            setLoading(false)
    })
           

        .catch(err=>{
        setLoading(false)
          setError(err.code)
            console.log(err.code)}
           
            )
      }
  return (
    <div>
        <button onClick={fetchPokemon}>Fetch Pokemon</button>

        {loading?<h1>Loading</h1>:""}
       
        {
           


            pokemon?(
                <div>
                <ul>
          {pokemon.results.map((pokemon, index) => (
            <li key={index}>{pokemon.name}</li>
          ))}
        </ul>

                
            </div>
            ):<h2>{error}</h2>

        }
            
          

        </div>
  )
}

export default Pokemon