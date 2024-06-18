
from flask import redirect, render_template,request
from ..models.dojo import Dojo

from .. import app



@app.route('/')
def index():
    return redirect('/dojos')

@app.route('/dojos')
def get_list_dojos():
    return render_template('index.html',dojos_list=Dojo.get_all())

@app.route('/add_dojo',methods=["POST"])
def create_user():
    Dojo.save(request.form)
    return redirect('/')



