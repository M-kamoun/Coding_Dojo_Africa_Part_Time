from flask_app import app

#Ensure this file is being run directly and not from a different module.
if __name__=="__main__":
#Run the app in debug mode and change the default port to 9000.
    app.run(debug=True)