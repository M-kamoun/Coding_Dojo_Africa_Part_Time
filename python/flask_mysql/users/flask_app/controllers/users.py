from flask_app import app
from flask import redirect, render_template,request
from flask_app.models.user import User



@app.route('/')
def index():
    return redirect('/users')

@app.route('/users')
def read():
    users = User.get_all()
    print(users)
    return render_template('read.html',users=users)

@app.route('/user/show/<int:id>')
def read_one(id):
    data={'id':id}
    user = User.get_one(data)
    print(user)
    return render_template('show.html',user=user)

@app.route('/user/edit/<int:id>')
def update(id):
    data={'id':id}
    user = User.get_one(data)
    print(user)
    return render_template('edit.html',user=user)


@app.route('/create_user',methods=["POST"])
def create_user():
    User.save(request.form)
    return redirect('/')

@app.route('/user/update',methods=['POST'])
def update_user():
    print (request.form)
    User.update(request.form)
    return redirect('/users')

@app.route('/user/new')
def new():
    return render_template('create.html')

@app.route('/user/destroy/<int:id>')
def destroy(id):
    data ={
        'id': id
    }
    User.destroy(data)
    return redirect('/users')








