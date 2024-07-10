const person = {
  firstName: "Bob",
  lastName: "Marley",
  email: "bob@marley.com",
  password: "sekureP@ssw0rd9",
  username: "barley",
  createdAt: 1543945177623,
};
const animals = ["horse", "dog", "fish", "cat", "bird"];

// BEFORE ES6
// var email = person.email;
// var firstAnimal = animals[0];

// console.log(email);
// console.log(firstAnimal);

// AFTER ES6
const { email } = person;
const [firstAnimal, , , , lastAnimal] = animals;
console.log(email);
// => bob@marley.com
console.log(firstAnimal + " - " + lastAnimal);
// => horse

const password = "12345";
const { password: hashedPassword } = person;
console.log(hashedPassword);
