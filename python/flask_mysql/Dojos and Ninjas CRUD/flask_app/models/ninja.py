from flask_app.config.mysqlconnection import connectToMySQL,DB


class Ninja:
    def __init__( self , data ):
        self.id = data['id']
        self.first_name = data['first_name']
        self.last_name = data['last_name']
        self.age = data['age']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
      
        
    
    # @classmethod
    # def get_one_ninja(cls,data):
    #     query= """"
    #             SELECT * FROM ninjas 
    #             JOIN dojos 
    #             ON ninjas.dojo_id=dojos.id
    #             WHERE dojo_id=%(id)s;
    #     """
    #     results = connectToMySQL(DB).query_db(query,data)
    #     if results==[]:
    #         return None
    #     ninja=cls(results[0])
    #     dojo_data={
    #         'id' : results[0]['dojos.id'],
    #         'name' : results[0]['name'],
    #         'created_at' : results[0]['dojos.created_at'],
    #         'updated_at' : results[0]['dojos.updated_at']
            
    #     }
    #     ninja.dojo=Dojo(dojo_data)
    #     return ninja
    
    
    # def get_all_ninja(cls):
    #     query= """"
    #             SELECT * FROM ninjas 
    #             JOIN dojos 
    #             ON ninjas.dojo_id=dojos.id;
    #     """
    #     results = connectToMySQL(DB).query_db(query)
    #     if results==[]:
    #         return []
    #     ninjas=[]
        
    #     for row in results:
    #         ninja=cls(row)
    #         dojo_data={
    #             'id' : row['dojos.id'],
    #             'name' : row['name'],
    #             'created_at' : row['dojos.created_at'],
    #             'updated_at' : row['dojos.updated_at']
    #     }
    #         ninja.dojo=Dojo(dojo_data)
    #         ninjas.append(ninja)
        
    #     return ninja
        
        
    
    @classmethod
    def save_ninja(cls, data):
        query = "INSERT INTO ninjas (first_name,last_name,age,dojo_id) VALUES (%(first_name)s,%(last_name)s,%(age)s,%(dojo_id)s);"
        return connectToMySQL(DB).query_db(query, data)
    
    
        