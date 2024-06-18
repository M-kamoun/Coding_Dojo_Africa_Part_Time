from flask import Flask, render_template, request, redirect, session
import random

app = Flask(__name__)
app.secret_key = 'keep it secret, keep it safe'

@app.route("/")
def random_number():
    if "number" not in session:
        session['number'] = random.randint(1,100)
    if "count" not in session:
        session["count"]=0
    else : 
        session["count"]+=1
        
    return render_template('index.html',number=session['number'],count=session['count'])

@app.route('/guess',methods=['POST'])
def guess():
    session['guess'] = int(request.form['guess'])
    return redirect('/')

@app.route('/reset')
def reset():
    session.clear()
    return redirect('/')

@app.route('/win',methods=['POST'])
def win():
    name=request.form['name']
    return render_template('leaderboard.html',name=name)




#Ensure this file is being run directly and not from a different module.
if __name__=="__main__":
#Run the app in debug mode and change the default port to 9000.
    app.run(debug=True)