# import flask to allow us to create our app.
from flask import Flask,render_template  
# Create a new instance of the Flask class called "app"
app = Flask(__name__)
#define a route()

@app.route('/')
def checker_board_1():
    return render_template("index.html",col=8,row=8,color0="blue",color1="red")


@app.route('/<int:row>')
def checker_board_2(row):
    return render_template("index.html",row=row,col=8,color0="blue",color1="red")

@app.route('/<int:row>/<int:col>')
def checker_board_3(row,col):
    return render_template("index.html",row=row,col=col,color0="blue",color1="red")

@app.route('/<int:row>/<int:col>/<string:color0>/<string:color1>')
def checker_board_ninja(row,col,color0,color1):
   
    return render_template("index.html",row=row,col=col,color0=color0,color1=color1)











#Ensure this file is being run directly and not from a different module.
if __name__=="__main__":
#Run the app in debug mode and change the default port to 9000.
    app.run(debug=True)