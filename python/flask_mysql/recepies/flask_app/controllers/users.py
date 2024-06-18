from flask import flash, render_template,redirect,request,session
from flask_app import app

from ..models.user import User

@app.route('/')
def index():
    if 'user_id' in session:
        return redirect('/recipes')
    return render_template('index.html')

@app.route('/register', methods=["POST"])
def register():
    data = request.form
  
    if User.validate_register(data):
        User.create(data)
        flash("Registration Success!","success")
    return redirect('/')

@app.route('/login', methods=["POST"])
def login():
    data = request.form
    
    if User.validate_login(data):
        user = User.get_by_email(data)
        session['user_id'] = user.id
        return redirect('/recipes')
    return redirect('/')



@app.route('/logout')
def logout():
    session.clear()
    return redirect('/')
