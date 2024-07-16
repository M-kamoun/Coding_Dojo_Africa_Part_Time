import "./App.css";
import PersonCard from "./PersonCard";

const personArr = [
  { firstName: "Jane", lastName: "Doe", age: 45, hairColor: "Black" },
  { firstName: "Jhon", lastName: "Smith", age: 50, hairColor: "Black" },
  { firstName: "Maria", lastName: "Smith", age: 45, hairColor: "Black" },
  { firstName: "Mehdi", lastName: "Kamoun", age: 45, hairColor: "Black" },
];

function App() {
  return (
    // <div className="App">
    //   <PersonCard firstName="Jane" lastName="Doe" age={45} hairColor="Black" />
    //   <PersonCard
    //     firstName="John"
    //     lastName="Smith"
    //     age={88}
    //     hairColor="Brown"
    //   />
    //   <PersonCard
    //     firstName="Millard"
    //     lastName="Fillmore"
    //     age={50}
    //     hairColor="Brown"
    //   />
    //   <PersonCard
    //     firstName="Maria"
    //     lastName="Smith"
    //     age={62}
    //     hairColor="Brown"
    //   />
    // </div>
    <div className="App">
      {personArr.map((person) => {
        return (
          <PersonCard
            firstName={person.firstName}
            lastName={person.lastName}
            age={person.age}
            hairColor={person.hairColor}
          />
        );
      })}
    </div>
  );
}

export default App;
