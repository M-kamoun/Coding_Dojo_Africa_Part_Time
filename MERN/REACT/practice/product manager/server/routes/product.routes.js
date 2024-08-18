

const ProductController = require('../controllers/product.controller');
module.exports = function(app){
   
    app.get('/products', ProductController.getAllProducts);
    app.post('/products', ProductController.createProduct)
    app.get('/products/:id', ProductController.getOneProduct);
   
}
