const express = require("express");

require("dotenv").config();
require("./config/mongoose.config");

const app = express();
const port = process.env.PORT;

app.use(express.json());
express.urlencoded({ extended: true });

const Allroutes = require("./routes/joke.routes");
Allroutes(app);

app.listen(port, () => console.log(`Listening on port: ${port}`));
