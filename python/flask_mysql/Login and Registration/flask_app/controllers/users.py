from flask import render_template,redirect,request,session
from flask_app import app

from ..models.user import User

@app.route('/')
def index():
    return render_template('index.html')

@app.route('/register', methods=["POST"])
def register():
    data = request.form
  
    if User.validate_register(data):
        User.create(data)
    return redirect('/')

@app.route('/login', methods=["POST"])
def login():
    data = request.form
    
    if User.validate_login(data):
        session['logged_user_email'] = data['email']
        return redirect('/dashboard')
    return redirect('/')

@app.route('/dashboard')
def dashboard():
    if not 'logged_user_email' in session:
        return redirect('/')
    return render_template('dashboard.html')

@app.route('/logout')
def logout():
    session.clear()
    return redirect('/')
