# import flask to allow us to create our app.
from flask import Flask,render_template  
# Create a new instance of the Flask class called "app"
app = Flask(__name__)

@app.route('/play')
def func_level_1():
    return render_template("index.html",num=3,color="#9FC5F8")

@app.route('/play/<int:id>')
def func_level_2(id):
     return render_template("index.html",repeat=id,color="#9FC5F8")

@app.route('/play/<int:id>/<string:color>')
def func_level_3(id,color):
     return render_template("index.html",repeat=id,color=color)















#Ensure this file is being run directly and not from a different module.
if __name__=="__main__":
#Run the app in debug mode and change the default port to 9000.
    app.run(debug=True)