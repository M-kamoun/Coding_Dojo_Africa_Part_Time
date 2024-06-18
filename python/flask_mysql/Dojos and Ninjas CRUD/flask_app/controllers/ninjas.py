from flask_app import app
from flask import redirect, render_template,request
from flask_app.models.ninja import Ninja
from flask_app.models.dojo import Dojo



@app.route('/create_ninja')
def create_ninja():
    dojos=Dojo.get_all()
    return render_template('createninja.html',dojos=dojos)

@app.route('/add_ninja',methods=["POST"])
def add_ninja():
    ninja=Ninja.save_ninja(request.form)
    return redirect('/dojos')


