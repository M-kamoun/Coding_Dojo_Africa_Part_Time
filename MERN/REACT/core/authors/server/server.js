//! express.js
const express = require('express');
const app = express();

//!dotenv
require('dotenv').config();
const port = process.env.PORT;

//! Mongoose connection to MongoDB
require('./config/mongoose.config');

//!Cors
const cors = require('cors');

//! BodyParser and Cors
app.use(express.json(), express.urlencoded({ extended: true }),cors());

// //! Routes
require('./routes/author.routes')(app); 

//! listen the port number
app.listen(port, () => console.log(`Listening on port: ${port}`) );


