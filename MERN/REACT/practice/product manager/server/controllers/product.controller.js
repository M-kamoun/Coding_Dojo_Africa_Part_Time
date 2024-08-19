

const Product = require('../models/product.model')



//! Read all products
module.exports.getAllProducts = (req, res) => {
    Product.find()
       .then(products => res.json({
        success: true,
        message: "❎❎❎ Products fetched successfully ❎❎❎",
        count: products.length,
        results: products}))
       .catch(err => res.status(400).json({
        success: false,
        message : "❌❌❌Error fetching products❌❌❌"
    }));
}


//!read one product

module.exports.getOneProduct = (req, res) => {
    Product.findOne({ _id: req.params.id })
       .then(product => 
        
        res.json({ 
            success: true,
            message: "❎❎❎ Product fetched successfully ❎❎❎",
            results: product })
       )
        
        .catch(err => res.status(400).json({
            success: false,
            message : "❌❌❌Error fetching products❌❌❌",
            error : err.message
        }));
}


//!create a new product
module.exports.createProduct = (req, res) => {
    Product.create(req.body)
        .then(newProduct => {
            res.json({ data: newProduct })
        })
        .catch((err) => {
            res.status(400).json(err)
        });
}


//!Update a product

module.exports.updateProduct = (req, res) => {
    Product.findByIdAndUpdate(req.params.id, req.body, {new: true, runValidators: true})
       .then(product => res.json({
        success: true,
        message: "❎❎❎❎Product updated successfully",
        results: product }))
        .catch(err => res.status(400).json({
            success: false,
            message : "❌❌❌Error fetching products❌❌❌"
        }));
}

//!delete a product

module.exports.deleteProduct = (req, res) => {
    Product.findOneAndDelete({ _id: req.params.id })
       .then(product => res.json({ 
        success: true, 
        message: "Product deleted successfully",
        results: product
     }))
       .catch(err => res.status(400).json({
            success: false,
            message : "Error fetching products"
        }));
}

