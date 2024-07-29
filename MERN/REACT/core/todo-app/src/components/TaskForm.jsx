import React, { useState } from 'react'

const TaskForm = ({addTask}) => {
    const[taskName,setTaskName]=useState('');
    const[error,setError]=useState('');

    const handleSubmit = (e)=>{
        e.preventDefault();
       
        if(taskName.length<1){
            return setError("No task added!")
        }
            setError('');
            addTask(taskName)
            setTaskName('')
           
          


       

    }
  return (
    <div>
         {
                    error ?
                    <p className='text-red-500 font-bold '>{ error }</p> :
                    ''
                }
        <form className='flex items-center my-7 gap-2' onSubmit={handleSubmit}>
            <input className='border rounded-lg focus:outline-none flex-1 h-14 p-6 placeholder:text-slate-600 ' type="text" 
            value={taskName} 
            placeholder='Enter your Task...'
            onChange={(e)=>setTaskName(e.target.value)}
            />
            <button className='border-none rounded-full bg-blue-600 w-24 h-14 text-white text-lg font-medium '>Add</button>
          
        </form>
    </div>
  )
}

export default TaskForm