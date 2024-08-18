import React, { useEffect, useState } from 'react'
import { useParams} from 'react-router-dom'

import axios from 'axios';

const OneProduct = () => {
    const {id}= useParams();
    const [oneProduct, setOneProduct] = useState({})

    useEffect(() => {
        axios.get(`http://localhost:8000/products/${id}`)
            .then(res => {
                
                setOneProduct(res.data.results)
            })
            .catch(err => {
                console.log(err)
            })
    }, [id])


  return (
    <div className='flex justify-center place-items-center h-screen'>
          <div key={oneProduct._id}>
            <h3 className='text-3xl text-center font-semibold'>{oneProduct.title}</h3>
            <div className='text-center text-2xl text-blue-600'>
            <p>Price: ${oneProduct.price}</p>
            <p>{oneProduct.description}</p>
            </div>
           
        </div>
    </div>
  
  )
}

export default OneProduct