

import TaskForm from "./components/TaskForm"
import Task from "./components/Task"
import { useEffect, useState } from "react"


function App() {
  const[tasks,setTasks]=useState(localStorage.getItem('tasks')?JSON.parse(localStorage.getItem('tasks')):[]);

  

   

  useEffect(()=>{

    localStorage.setItem('tasks',JSON.stringify(tasks))
  },[tasks])

  

  

  const addTask = (nameTask)=>{
    console.log("new task added : "+nameTask)
    setTasks([...tasks,{name:nameTask,done:false}])
  }

  

  const deleteTask = (index)=>{
    console.log("task deleted : "+tasks[index].name)
   setTasks( tasks.filter((_,i)=>i !== index));}

   
    

  const toogle = (index,newDone)=>{
    setTasks((prev)=>[...prev].map((task,i)=>i===index?{...task,done:newDone} : task));
  }
       
  
  const numberCompleted = tasks.filter(t=>t.done).length;
  const totalTask = tasks.length;
  const percentage = Math.ceil(numberCompleted/totalTask * 100);

  const getMessage = ()=>{



    if(percentage===0){return <h2 className="text-xl text-red-800">Try to do at least One! 😉</h2> }
    if(percentage===50 ){return <h2 className="text-xl text-orange-400"> 50% Done - Great!👍</h2> }
    if(percentage>50 && percentage<100)
      {
        if(numberCompleted===totalTask- 1){return <h2 className="text-xl text-orange-400">Just One Task ! 👌</h2> }
        return <h2 className="text-xl text-orange-400">Almost Done!👌</h2> }
    
    if(percentage===100){return <p className="text-xl text-green-500">Good Job!💯</p>}
     
    return <h2 className="text-xl ">Keep it going on 💪</h2>

  }
  
  
        
      
        
    
   

   
    

  return (
    <div className="bg-gray-500 grid py-4 min-h-screen ">

     
  
     <div className="bg-white w-10/12 place-self-center border max-w-md flex flex-col p-7  rounded-xl">
     
     
     <h1 className="text-3xl text-gray-700 font-extrabold text-center my-2">TO DO LIST</h1>
    <hr className="border-t-2 border-blue-500"/>
     {
      tasks.length>0? 
      <div>
        <h1 className="text-xl mt-4"><span className="text-green-700 font-bold underline underline-offset-2 ">Task Completed ({percentage}%) :</span> {numberCompleted} / {tasks.length}</h1>
        {getMessage()}
        
      </div>
      :""
     }

      <TaskForm addTask={addTask}/>

     
           {tasks.map((task,index)=>(
             <Task
             key={index} 
            {...task}
             deleteTask={()=>deleteTask(index)}
            update={(done)=>toogle(index,done)}
             
             />)
           )}
     
     </div>
    </div>
  )
}

export default App
