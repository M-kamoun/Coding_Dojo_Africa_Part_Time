const Author = require("../models/author.model");

//!---------------------------------------READ ALL AUTHORS-----------------------------------------------
module.exports.getAllAuthors = (req, res) => {
  Author.find()
    .sort({ name: 1 })
    .then((authors) => {
      authors.sort((a, b) =>
        a.name.toLowerCase().localeCompare(b.name.toLowerCase())
      );
      res.json({
        success: true,
        count: authors.length,
        message: "❎❎All authors fetched successfully ❎❎ ",
        results: authors,
      });
    })
    .catch((err) => res.status(400).json(err));
};

//!---------------------------------------READ ONE AUTHOR-----------------------------------------------

module.exports.getOneAuthor = (req, res) => {
  Author.findOne({ _id: req.params.id })
    .then((author) => {
      if (!author) {
        return res.status(404).json({
          success: false,
          message: "❌❌❌Author not found❌❌❌",
        });
      }
      res.json({
        success: true,
        message: "❎❎❎Author fetched successfully❎❎❎",
        results: author,
      });
    })
    .catch((err) => res.status(400).json(err));
};

//!---------------------------------------CREATE NEW AUTHOR-----------------------------------------------

module.exports.createAuthor = (req, res) => {
  Author.create(req.body)
    .then((author) =>
      res.json({
        success: true,
        message: "❎❎ New Author created successfully ❎❎",
        results: author,
      })
    )
    .catch((err) => res.status(400).json(err));
};

//!---------------------------------------UPDATE AUTHOR-----------------------------------------------

module.exports.updateAuthor = (req, res) => {
  Author.findOneAndUpdate({ _id: req.params.id }, req.body, {
    new: true,
    runValidators: true,
  })
    .then((author) => {
      if (!author) {
        return res.status(404).json({
          success: false,
          message: "❌❌❌Author not found❌❌❌",
        });
      }

      res.json({
        success: true,
        message: "❎❎❎Author updated successfully ❎❎❎",
        results: author,
      });
    })
    .catch((err) => res.status(400).json(err));
};

//!---------------------------------------DELETE AUTHOR-----------------------------------------------

module.exports.deleteAuthor = (req, res) => {
  Author.findOneAndDelete({ _id: req.params.id })
    .then((author) => {
      if (!author) {
        return res.status(404).json({
          success: false,
          message: "❌❌❌Author not found❌❌❌",
        });
      }

      res.json({
        success: true,
        message: "❎❎❎Author deleted successfully ❎❎❎",
        results: author,
      });
    })
    .catch((err) => res.status(400).json(err));
};
