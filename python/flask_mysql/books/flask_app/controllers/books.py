from flask import redirect, render_template,request
from ..models import book

from .. import app

@app.route('/')
def index():
    return redirect('/authors')

@app.route('/books')
def get_books():
    return render_template('books.html',books_list=book.Book.get_all())

@app.route('/add_book',methods=["POST"])
def add_book():
    book.Book.save(request.form)
    return redirect('/books')


