


import React from 'react'
import Tabs from './Tabs'

const App = () => {
  const items =[
    {label:'Tab 1',content:'First Tabulation  content is showing Here!'},
    {label:'Tab 2',content:'Second Tabulation content is showing Here!'},
    {label:'Tab 3',content: 'Lorem ipsum dolor, sit amet consectetur adipisicing elit. Enim voluptates nesciunt distinctio. Molestiae magnam quaerat doloribus voluptatum quo iure ducimus!'  }
  ]
  return (
    <div>
      <Tabs items={items}/>
    </div>
  )
}

export default App