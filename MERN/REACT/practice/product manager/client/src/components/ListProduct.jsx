import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';

const ListProduct = () => {

    const [list,setList] = useState([])

    useEffect(() =>{
        axios.get('http://localhost:8000/products')
        .then(res=> setList(res.data.results))
        .catch(err=>console.log(err))
    },[list]);

  return (
    <div className='mt-5'>
          <hr />
        <h1 className='text-center font-semibold text-2xl p-6'>All Products</h1>
            <div className='flex flex-wrap justify-center'>
            {list.map((product)=>{
            return (
            <ul  key={product._id} className='inline-block text-center mr-5'>
                 <li><Link to={`/products/${product._id}`} >{product.title}</Link></li>
               
            </ul>
            
            )
             
        }
            
        )}
            </div>
       
    </div>
  )
}

export default ListProduct