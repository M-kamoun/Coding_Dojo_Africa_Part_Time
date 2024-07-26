import React,{useState} from 'react'




const Tabs = ({items}) => {
    const[activeTab,setActivetab]=useState(0);

    const handleTabClick = (index)=>{
        setActivetab(index)
        console.log(index)
    }
  return (
    <div className='max-w-md mx-auto mt-10'>
        <div className='flex justify-start gap-4'>
        {items.map((item,index)=>{
            return <button 
            key={index}
            className={` font-semibold py-2 px-4 border border-blue-500 rounded ${activeTab===index? 'bg-blue-500 text-white':'bg-transparent text-blue-700 hover:bg-blue-500 hover:text-white '} `}
            onClick={()=>handleTabClick(index)}
            
            >{item.label}</button>
            
        })}
        </div>
        
        <div className=' md:max-w-xl mt-10 border-2  border-gray-700  py-6 px-4 font-semibold text-lg  '>{items[activeTab].content}</div>

        
    </div>
  )
}

export default Tabs