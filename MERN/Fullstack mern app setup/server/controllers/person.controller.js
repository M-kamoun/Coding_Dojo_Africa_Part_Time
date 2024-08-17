
const { Person } = require('../models/person.model');
module.exports.index = (request, response) => {
    response.json({
       message: "Hello World"
    });
}

module.exports.getAllPersons = (req, res) => {
    Person.find()
       .then(persons => res.json({count : persons.length,data: persons}))
       .catch(err => res.status(400).json({message : err.message}));
}


module.exports.createPerson= (req, res) => {
  
    Person.create(req.body)
    .then(person=>res.json({data: person}))
    .catch(err => res.status(400).json({message : err.message}));
}

