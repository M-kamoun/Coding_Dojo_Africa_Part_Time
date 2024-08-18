


const mongoose = require('mongoose');
const ProductSchema = new mongoose.Schema({
    title: { 
        type: String,
        required: [true,"{path} is required"]
    },
    price:{
        type: Number,
        required: [true,"{path} is required"]
    },

    description: {
        type: String,
        required: [true,"{path} is required"]
    }
 
}, { timestamps: true });
// module.exports.Product = mongoose.model('Product', ProductSchema);

const Product = mongoose.model('Product', ProductSchema);
module.exports = Product;