
class user:
    def __init__(self,first_name,last_name,email,age): 
        self.fname=first_name
        self.lname=last_name
        self.email=email
        self.age=age
        self.is_rewards_member =False
        self.gold_card_points = 0
        
    def display_info(self):
        print("#"*40)
        print(f"First Name : {self.fname}")
        print(f"Last Name : {self.lname}")
        print(f"e-mail : {self.email}")
        print(f"Age : {self.age}")
        print(f"rewards members : {self.is_rewards_member}")
        print(f"gold card points : {self.gold_card_points}")
        
        print("#"*40)
        
    def enroll(self):
        if (self.is_rewards_member) :
            print("User is already member")
            return self    
        
        self.is_rewards_member=True
        self.gold_card_points=200
        return self
        
    def spend_point(self,amount):
        if self.gold_card_points<amount:
            print("You don't have enough points.")
            return False
        self.gold_card_points-=amount
        print(f"You have spent {amount} Now you have {self.gold_card_points}")
        


user_1 = user("Mehdi","Kamoun","kamounmehdi1@gmail.com",45)
user_2 = user("mohamed","koobaa","mkoobaa1@gmail.com",35)
user_3 = user("ilyes","hamada","hamada@gmail.com",25)

user_1.display_info()
user_2.enroll().spend_point(80)
user_3.enroll().spend_point(40)
# user_1.spend_point(50)
# user_1.enroll()
# user_1.display_info()

# user_2.display_info()
# user_3.display_info()
# user_2.enroll()
# user_2.display_info()
# user_2.spend_point(80)
# user_2.display_info()
# user_3.spend_point(40)


