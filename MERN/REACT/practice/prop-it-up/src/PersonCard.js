import React, { useState } from "react";

const PersonCard = (props) => {
  const { firstName, lastName, age, hairColor } = props;
  const [ageValue, setValue] = useState(age);
  const handleClick = () => {
    setValue(ageValue + 1);
  };
  return (
    <div>
      <h1>
        {lastName}, {firstName}
      </h1>
      <p>Age : {ageValue}</p>
      <p>Hair Color : {hairColor}</p>
      <button onClick={handleClick}>
        Birthday Button for {lastName} {firstName}
      </button>
    </div>
  );
};

export default PersonCard;
