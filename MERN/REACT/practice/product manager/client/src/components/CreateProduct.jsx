import React, { useState } from 'react'
import axios from 'axios';
import ListProduct from './ListProduct';

const CreateProduct = () => {

    const [formdata,setFormData]=useState({
        title:'',
        price:0,
        description:''
    });

    const handleInputChange=(e)=>{
        const {name,value} = e.target
        setFormData({...formdata,[name]:value})
    }
    const handleSubmit=(e)=>{
        e.preventDefault()
       
      
            axios.post("http://localhost:8000/products",formdata)
            .then(res=>console.log(res.data))
            .catch(err=>console.log(err))
    
    }



  return (
    <div className='container mx-auto p-4 '>
        <div className=' flex justify-center place-items-start mt-5'>
    <div className='bg-white p-5 rounded-lg shadow-md w-96'>
        
        <h1 className='text-3xl font-semibold text-center mb-4'>Product Manager</h1>
    <form onSubmit={handleSubmit}>
        <div className='mb-4'>
            <label  className=" block text-sm font-medium text-gray-600">Title</label>
            <input className='mt-1 p-2 w-full border rounded-md first-line: border-gray-300   focus:outline-none focus:ring-0' 
            type="text" 
            name="title" 
            value={formdata.title}
            onChange={handleInputChange}
            id="" />
        </div>
        <div className='mb-4'>
            <label  className=" block text-sm font-medium text-gray-600" htmlFor="">Price</label>
            <input className='mt-1 p-2 w-full border rounded-md first-line: border-gray-300   focus:outline-none focus:ring-0' 
            type="number" 
            name="price" 
            value={formdata.price}
            onChange={handleInputChange}
            id="" />
        </div>
        <div className='mb-4'>
            <label  className=" block text-sm font-medium text-gray-600" htmlFor="">Description</label>
            <input className='mt-1 p-2 w-full border rounded-md first-line: border-gray-300   focus:outline-none focus:ring-0' 
            type="text" 
            name="description" 
            value={formdata.description}
            onChange={handleInputChange}
            id="" />
        </div>
        <input type='submit' className='bg-blue-500 hover:bg-blue-700 text-white font-bold py-2 px-4 rounded-md mt-5 w-full' 
        value='Create'/>
    </form>
    </div>
    
   </div>
   <div>
    <ListProduct/>
   </div>
    
    </div>
    
  )
}

export default CreateProduct