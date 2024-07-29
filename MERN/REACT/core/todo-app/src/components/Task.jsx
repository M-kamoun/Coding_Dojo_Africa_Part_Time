import React, { useState } from 'react'
import { FaRegTrashAlt } from "react-icons/fa";
import Checkbox from './Checkbox';



const Task = ({name,done,deleteTask,update}) => {

 
   


  return (
   
    <div className='flex items-center my-3 gap-2'>
    
    <div onClick={()=>update(!done)} className='flex items-center flex-1 cursor-pointer'>
    <Checkbox checked={done} />
        <p className={`text-slate-700 ml-4 text-2xl decoration-slate-500 ${done?"line-through opacity-25":""}`} >{name}</p>
    </div>
   
    <FaRegTrashAlt className='w-6 h-6 cursor-pointer' onClick={deleteTask}/>
   
    

</div>
   
    
  )
}

export default Task