const AuthorController = require('../controllers/author.controllers')

module.exports = (app) => {
    //!------- Create Author
    app.post('/authors/new', AuthorController.createAuthor),
    //!------- get all authors
    app.get('/authors', AuthorController.getAllAuthors)
    //!------- get author by id
    app.get('/authors/:id', AuthorController.getOneAuthor)
    //!------- update author by id
    app.patch('/authors/:id/edit', AuthorController.updateAuthor)
    //!------- delete author by id
    app.delete('/authors/:id/delete', AuthorController.deleteAuthor)
    
}