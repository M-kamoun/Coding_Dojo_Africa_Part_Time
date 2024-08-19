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

    // delete product
    const deleteProduct = (id) => {
        axios.delete(`http://localhost:8000/products/${id}`)
       .then(res=>console.log(res.data.results))
       .catch(err=>console.log(err))
        setList(list.filter(product => product._id!== id))
    }

  return (
    <div className='mt-5'>
          <hr />
        <h1 className='text-center font-semibold text-2xl p-6'>All Products</h1>
            <div className='flex flex-wrap justify-center items-center '>
            {list.map((product)=>{
            return (
            <ul  key={product._id} className='inline-block text-center mr-5 p-6'>
                 <li><Link to={`/products/${product._id}`} >{product.title}</Link> <span className='bg-red-500 hover:bg-red-300 text-white font-bold py-2 px-4 rounded-md mt-5 cursor-pointer' 
                 onClick={() => { deleteProduct(product._id) }}>Delete</span></li>
               
            </ul>
            
            )
             
        }
            
        )}
            </div>
       
    </div>
  )
}

export default ListProduct