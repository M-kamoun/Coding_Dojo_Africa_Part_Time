from ..config.mysqlconnection import DB,connectToMySQL
from flask_bcrypt import Bcrypt
from flask_app import app
from flask import flash
import re

bcrypt=Bcrypt(app)

EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
class User:
    def __init__(self,data):
        self.id=data["id"]
        self.first_name=data["first_name"]
        self.last_name=data["last_name"]
        self.email=data["email"]
        self.password=data["password"]
        self.creates_at=data["created_at"]
        self.updated_at_at=data["updated_at"]
        
    
    @classmethod
    def create(cls,data):
        #hash password before saving
        encrypted_password = bcrypt.generate_password_hash(data["password"])
        #cast immutable dict to mutable dict
        data=dict(data)
        #update password
        data["password"]=encrypted_password
        query = "INSERT INTO users (first_name,last_name,email,password) VALUES (%(first_name)s,%(last_name)s,%(email)s,%(password)s);"
       
        return connectToMySQL(DB).query_db(query,data) #return id of new record or false
    
    @classmethod
    def get_by_email(cls,data):
        query="SELECT * from users where email=%(email)s; "
        results = connectToMySQL(DB).query_db(query,data)
        
        if not results:
            return None  
        return cls(results[0])
    
    
    @staticmethod
    def validate_register(data):
        is_valid=True
        user_in_db=User.get_by_email(data)
        if len(data['first_name']) < 2 :
            is_valid = False
            flash("first_Name must be at least 2 characters.",'register')
        if not data["first_name"].isalpha():
            is_valid = False
            flash("first_Name must letters only.","register")
        if len(data['last_name']) < 2 :
            is_valid = False
            flash("last_Name must be at least 2 characters.","register")
        if not data["last_name"].isalpha():
            is_valid = False
            flash("last_Name must letters only.","register")
        if not EMAIL_REGEX.match(data['email']): 
            is_valid = False
            flash("Invalid email address!","register")
            
        if user_in_db :
            is_valid = False
            flash("This email address is already exist!","register")
        
        if len(data['password']) < 8 :
            is_valid = False
            flash("password must be at least 8 characters.","register")
            
        if data["password"]!=data["confirm_password"]:
            is_valid=False
            flash("password must match!","register")
        
        return is_valid

    @staticmethod
    def validate_login(data):
        is_valid=True
        user_in_db=User.get_by_email(data)
        if not EMAIL_REGEX.match(data['email']): 
            is_valid = False
            flash("Invalid email address!","login")
            
        if not user_in_db:
            is_valid = False 
            flash("This email address is not exist!","login")
        elif not bcrypt.check_password_hash(user_in_db.password,data["password"]):
            is_valid=False
            flash("Incorrect password!","login")
        
        return is_valid
    
    @classmethod
    def get_by_id(cls , data):
        query = "SELECT * FROM users WHERE id = %(id)s;"
        results = connectToMySQL(DB).query_db(query , data)

        if results:
            return cls(results[0])
        return None
            
       
        
        
        
        
        
        