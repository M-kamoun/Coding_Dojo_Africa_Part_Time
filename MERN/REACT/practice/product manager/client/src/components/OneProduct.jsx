import React, { useEffect, useState } from 'react'
import { useParams,Link, useNavigate} from 'react-router-dom'

import axios from 'axios';

const OneProduct = () => {
    const {id}= useParams();
    const [oneProduct, setOneProduct] = useState({})
    const navigate=useNavigate();

    useEffect(() => {
        axios.get(`http://localhost:8000/products/${id}`)
            .then(res => {
                
                setOneProduct(res.data.results)
            })
            .catch(err => {
                console.log(err)
            })
    }, [id])


    const deleteProduct = (id) => {
      axios.delete(`http://localhost:8000/products/${id}`)
     .then(res=>{
      console.log(res.data.results)
      navigate('/')

     }
     )
     .catch(err=>console.log(err))
     
  }


  return (
    <div className='flex justify-center place-items-center h-screen'>
          <div key={oneProduct._id}>
            <h3 className='text-3xl text-center font-semibold'>{oneProduct.title}</h3>
            <div className='text-center text-2xl text-blue-600 p-6'>
            <p>Price: ${oneProduct.price}</p>
            <p>{oneProduct.description}</p>
          
            </div>
            <div className='mt-10 text-center'>
            <Link  to={`/products/${oneProduct._id}/update`}> <span  className='bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded-md mr-5'>Update</span></Link>
           <span className='bg-red-500 hover:bg-red-300 text-white font-bold py-2 px-4 rounded-md cursor-pointer' onClick={()=>deleteProduct(oneProduct._id)}>Delete</span>
            </div>
           
        </div>
    </div>
  
  )
}

export default OneProduct