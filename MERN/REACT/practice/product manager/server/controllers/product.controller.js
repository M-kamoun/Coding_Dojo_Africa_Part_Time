

const Product = require('../models/product.model')

module.exports.index = (req, res) => {
    res.json({
       message: "Hello World"
    });
}

//! Read all products
module.exports.getAllProducts = (req, res) => {
    Product.find()
       .then(products => res.json({
        success: true,
        message: "❎❎❎ Products fetched successfully ❎❎❎",
        count: products.length,
        data: products}))
       .catch(err => res.status(400).json({
        success: false,
        message : "❌❌❌Error fetching products❌❌❌"
    }));
}

module.exports.createProduct = (req, res) => {
    Product.create(req.body)
        .then(newProduct => {
            res.json({ data: newProduct })
        })
        .catch((err) => {
            res.status(400).json(err)
        });
}

