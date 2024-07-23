import styles from './form.module.css'
import { useState } from "react"
const Form = ({addBox}) => {
    const [color, setColor] = useState('')
    const [size, setSize] = useState(0)

   
    const handleColor = (e)=>{
        e.preventDefault();
        const newValue = {color,size}
        addBox(newValue);
        setColor('');
        setSize(0);

    }

  return (
    <div className={styles.formBox}>
        <form onSubmit={handleColor} className={styles.formControl}>
            <div> <label htmlFor='color'>Color : </label>
            <input className={styles.inputBox} type="text"  onChange={(e)=>{setColor(e.target.value)}} value={color} id='color' /></div>
          <div><label htmlFor='size'>width / heigth : </label>
          <input className={styles.inputBox} type="text"  onChange={(e)=>{setSize(e.target.value)}} value={size} id='size' /></div>
            
            <button className={styles.btn} type="submit">Add</button>
           
        </form>
    </div>
  )
}

export default Form