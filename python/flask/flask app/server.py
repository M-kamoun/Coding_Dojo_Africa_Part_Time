# import flask to allow us to create our app.
from flask import Flask  
# Create a new instance of the Flask class called "app"
app = Flask(__name__)
#define a route()

@app.errorhandler(404)
def error(e):
    return "Sorry! No response. Try again."




@app.route('/')
def hello_world():
    return "Hello World!"

@app.route('/dojo')
def dojo():
    return "dojo"

@app.route('/say/<string:name>')
def say(name):
    return f"Hi {name.capitalize()}"

@app.route('/repeat/<int:id>/<string:word>')
def show_times(id,word):
    output=""
    for i in range(0,id):
        output+=f"<p>{word}</p>"
    return output


#Ensure this file is being run directly and not from a different module.
if __name__=="__main__":
#Run the app in debug mode and change the default port to 9000.
    app.run(debug=True)