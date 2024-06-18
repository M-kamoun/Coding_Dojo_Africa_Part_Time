from ..config.mysqlconnection import DB,connectToMySQL
from flask_app.models.user import User


class Recipe:
    def __init__(self,data):
        self.id=data["id"]
        self.name=data["name"]
        self.description=data["description"]
        self.instructions=data["instructions"]
        self.under_30=data["under_30"]
        self.creates_at=data["created_at"]
        self.updated_at_at=data["updated_at"]
        
        self.user=None
        
    
    #CRUD OPERATIONS
    
    #READ
    
    @classmethod
    def get_by_id(cls,data):
        query=" SELECT * FROM recipes join users on recipes.user_id=users.id where recipes.id=%(id)s; "
        results= results = connectToMySQL(DB).query_db(query,data)
        if not results :
            return None
        recipe=cls(results[0])
        user_data = {
            'id': results[0]['users.id'],
            'email': results[0]['email'],
            'first_name': results[0]['first_name'],
            'last_name': results[0]['last_name'],
            'password': results[0]['password'],
            'created_at': results[0]['users.created_at'],
            'updated_at': results[0]['users.updated_at']
        }
        recipe.user=User(user_data)
        return recipe
    
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM recipes JOIN users ON recipes.user_id = users.id;"
        results = connectToMySQL(DB).query_db(query)

        if not results:
            return []
        recipes = []
        for row in results:
            recipe = cls(row)
            user_data = {
                'id': row['users.id'],
                'email': row['email'],
                'first_name': row['first_name'],
                'last_name': row['last_name'],
                'password': row['password'],
                'created_at': row['users.created_at'],
                'updated_at': row['users.updated_at']
            }
            recipe.user = User(user_data)
            recipes.append(recipe)
        return recipes
    
    @classmethod
    def create(cls , data):
        query = "INSERT INTO recipes (name ,description,instructions,date_m,under_30, user_id) VALUES(%(name)s , %(description)s , %(instructions)s , %(date_m)s ,%(under_30)s, %(user_id)s);"
        return connectToMySQL(DB).query_db(query , data)
    
    @classmethod
    def update(cls , data):
        query = "UPDATE recipes SET name = %(name)s , description = %(description)s ,instructions = %(instructions)s,date_m = %(date_m)s ,under_30 = %(under_30)s WHERE id = %(id)s;"
        return connectToMySQL(DB).query_db(query , data)
    
    @classmethod
    def delete(cls , data):
        query = "DELETE FROM recipes WHERE id = %(id)s;"
        return connectToMySQL(DB).query_db(query , data)