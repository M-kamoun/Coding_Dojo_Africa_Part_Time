import React from 'react'
import { MdOutlineCheckBoxOutlineBlank } from "react-icons/md";
import { MdOutlineCheckBox } from "react-icons/md";

const Checkbox = ({checked=false, onClick}) => {
    
  return (
    <div onClick={onClick}>
        {!checked && <MdOutlineCheckBoxOutlineBlank className='w-6 h-6' />}
        {checked && <MdOutlineCheckBox  className='w-6 h-6'/>}
         
    </div>
  )
}

export default Checkbox