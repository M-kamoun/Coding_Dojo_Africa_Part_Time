from flask import redirect, render_template,request
from ..models import author,book

from .. import app



@app.route('/authors')
def get_authors():
    return render_template('authors.html',authors_list=author.Author.get_all())

@app.route('/add_author',methods=["POST"])
def add_author():
    author.Author.save(request.form)
    return redirect('/')

@app.route('/author/<int:id>')
def show_author(id):
    data = {
        "id": id
    }
    return render_template('show_author.html',author=author.Author.get_by_id(data),unfavorited_books=book.Book.unfavorited_books(data))

@app.route('/join/book',methods=['POST'])
def join_book():
    data = {
        'author_id': request.form['author_id'],
        'book_id': request.form['book_id']
    }
    author.Author.add_favorite(data)
    return redirect(f'/author/{request.form['author_id']}')



