const Joke = require("../models/joke.model");

module.exports.findAllJoke = async (req, res) => {
  try {
    const jokes = await Joke.find();
    res.status(200).json({ count: jokes.length, jokes: jokes });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

module.exports.findOneJoke = async (req, res) => {
  try {
    const joke = await Joke.findOne({ _id: req.params.id });
    res.status(200).json({ joke: joke });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

module.exports.createJoke = async (req, res) => {
  try {
    const newJoke = await Joke.create(req.body);
    res.status(200).json({ joke: newJoke });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

module.exports.updateJoke = async (req, res) => {
  try {
    const joke = await Joke.findOneAndUpdate({ _id: req.params.id }, req.body, {
      new: true,
      runValidators: true,
    });
    res.status(200).json({ message: "Joke Updated Successfuly!", joke: joke });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};

module.exports.deleteJoke = async (req, res) => {
  try {
    const joke = await Joke.findOneAndDelete({ _id: req.params.id });
    res.status(200).json({ message: "Joke Deleted Successfuly!", joke: joke });
  } catch (error) {
    res.status(500).json({ message: error.message });
  }
};
