from flask_app import app
from flask import redirect, render_template,request
from flask_app.models.dojo import Dojo



@app.route('/')
def index():
    return redirect('/dojos')

@app.route('/dojos')
def read():
    dojos = Dojo.get_all()
    return render_template('dojos.html',dojos=dojos)

@app.route('/add_dojo',methods=["POST"])
def create_user():
    Dojo.save(request.form)
    return redirect('/')

@app.route('/dojo/<int:id>')
def display_dojo(id):
    data={'id':id}
    dojo=Dojo.get_ninjas(data)
    return render_template('ninjas.html',dojo=dojo)