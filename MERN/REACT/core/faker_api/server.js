const express = require("express");
const { faker } = require("@faker-js/faker");
const app = express();
const port = 8000;

const createProduct = () => {
  const newFake = {
    name: faker.commerce.productName(),
    price: "$" + faker.commerce.price(),
    department: faker.commerce.department(),
  };
  return newFake;
};

const createUser = () => {
  const newFakeUser = {
    password: faker.internet.password(),
    email: faker.internet.email(),
    phoneNumber: faker.phone.number(),
    lastName: faker.person.lastName(),
    FirstName: faker.person.firstName(),
    _id: faker.string.uuid(),
  };

  return newFakeUser;
};

const createCompany = () => {
  const newFakeCompany = {
    _id: faker.string.uuid(),
    name: faker.company.name(),
    address: {
      street: faker.location.street(),
      city: faker.location.city(),
      state: faker.location.state(),
      zipCode: faker.location.zipCode(),
    },
  };

  return newFakeCompany;
};

const newFakeProduct = createProduct();
console.log(newFakeProduct);

const newFakeUser = createUser();
console.log(newFakeUser);

const newFakeCompany = createCompany();
console.log(newFakeCompany);

app.get("/api/users/new", (req, res) => {
  res.json(newFakeUser);
});

app.get("/api/companies/new", (req, res) => {
  res.json(newFakeCompany);
});

app.get("/api/user/company", (req, res) => {
  res.json({ newFakeUser, newFakeCompany });
});

app.listen(port, () => console.log(`Listening on port: ${port}`));
