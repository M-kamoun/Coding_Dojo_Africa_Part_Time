class Ninja:
# implement __init__( first_name , last_name , treats , pet_food , pet )
    def __init__(self,first_name,last_name,treats,pet_food,pet):
        self.fname = first_name
        self.lname=last_name
        self.treats=treats
        self.pet_food=pet_food
        self.pet=pet
    
        
    
#implement the following methods:
#walk() - walks the ninja's pet invoking the pet play() method
    def walk(self):
        self.pet.play()
        return self
#feed() - feeds the ninja's pet invoking the pet eat() method    
    def feed(self):
        if len(self.pet_food) > 0:
            food=self.pet_food.pop()
            self.pet.eat()
            print(f"{self.pet.name} eat : {food}")
        else:
            print("you need some pet food")
        return self
#bathe() - cleans the ninja's pet invoking the pet noise() method    
    def bathe(self):
        self.pet.noise()

if __name__=="__main__":
    print("the file is being executed directly")
else : 
    print(f"the file is imported by another file called :{__name__}")