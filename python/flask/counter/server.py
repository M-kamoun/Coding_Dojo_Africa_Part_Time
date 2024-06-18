from flask import Flask, render_template, request, redirect, session

app = Flask(__name__)
app.secret_key = 'keep it secret, for safe'

@app.route("/")
def counter():
   
    
    if "counter" and "visited" not in session:
        session["counter"]=1
        session["visited"]=0
    else:
        session["counter"]+=1
        session["visited"]+=1

    return render_template("index.html",visit_count=session["visited"])


@app.route("/destroy_session")
def destroy_session():
    session.clear()
    return redirect('/')

@app.route("/add_two")
def add_two_session():
    session["counter"]+=1
    session["visited"]=session["visited"]
    return redirect('/')

@app.route("/add", methods=['POST'])
def add():
    if request.form["count"]:
        session["counter"]+=int(request.form["count"])
    return redirect('/')


















#Ensure this file is being run directly and not from a different module.
if __name__=="__main__":
#Run the app in debug mode and change the default port to 9000.
    app.run(debug=True)
