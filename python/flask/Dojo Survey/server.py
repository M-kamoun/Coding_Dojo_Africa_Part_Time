from flask import Flask, render_template, request, redirect, session

app = Flask(__name__)
app.secret_key = 'keep it secret, for safe'

infos=[]

@app.route("/")
def index():
    return render_template("index.html")

@app.route("/process", methods=["POST"])
def process():
    
    
    
    session['name']=request.form['name']
    session['location']=request.form['location']
    session['language']=request.form['language']
    session['comment']=request.form['comment']
    session['courses']=request.form['courses']
    
    # checkbox_value=request.form.get("news")
    # if checkbox_value :
    #     session['newsletter']=request.form['news']
    # else:
    #     session['newsletter']="Not Subscribed."
    
    checkbox_values = request.form.getlist("colors")
    print (checkbox_values)
       
     
    return render_template('result.html',val=checkbox_values)










#Ensure this file is being run directly and not from a different module.
if __name__=="__main__":
#Run the app in debug mode and change the default port to 9000.
    app.run(debug=True)
