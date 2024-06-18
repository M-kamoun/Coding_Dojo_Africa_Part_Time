


from  ..config.mysqlconnection  import connectToMySQL,DB


class Book:
    def __init__(self, data):
        self.id = data['id']
        self.title = data['title']
        self.num_of_pages = data['num_of_pages']
        self.created_at = data['created_at']
        self.updated_at = data['updated_at']
        # list of the authors who has favorited this book
        # self.authors_who_favorited = []
        
    @classmethod
    def get_all(cls):
        query = "SELECT * FROM books;"
        books = []
        results = connectToMySQL(DB).query_db(query)
        for row in results:
            books.append(cls(row))
        return books
    
    @classmethod
    def unfavorited_books(cls,data):
        query = "SELECT * FROM books WHERE books.id NOT IN ( SELECT book_id FROM favorites WHERE author_id = %(id)s );"
        results = connectToMySQL(DB).query_db(query,data)
        books = []
        for row in results:
            books.append(cls(row))
        print(books)
        return books
    
    
    
    
    
    
    
    @classmethod
    def save(cls,data):
        query = "INSERT INTO books (title,num_of_pages) VALUES (%(title)s,%(num_of_pages)s);"
        return connectToMySQL(DB).query_db(query,data)
