from flask_app import app
from flask import render_template , request , redirect , session

from flask_app.models.recipe import Recipe
from flask_app.models.user import User


@app.route('/recipes')
def recipes():
    if not 'user_id' in session:
        return redirect('/')
    user_data = {'id': session['user_id']}
    logged_user = User.get_by_id(user_data)
    recipes = Recipe.get_all()
    return render_template("recipes.html" , logged_user = logged_user, recipes=recipes)

@app.route('/recipes/new')
def add_review_page():
    logged_user = User.get_by_id({'id': session['user_id']})
    return render_template("add_recipe.html" , logged_user  = logged_user)