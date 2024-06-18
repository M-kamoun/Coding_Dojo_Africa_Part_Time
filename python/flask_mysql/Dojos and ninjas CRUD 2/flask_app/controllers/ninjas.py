from flask_app import app
from flask import redirect, render_template,request
from ..models import dojo,ninja 



@app.route('/ninjas')
def ninjas():
    return render_template('ninja.html',dojos=dojo.Dojo.get_all())

@app.route('/add_ninja',methods=["POST"])
def add_ninja():
    ninja=ninja.Ninja.save_ninja(request.form)
    return redirect('/dojos')
