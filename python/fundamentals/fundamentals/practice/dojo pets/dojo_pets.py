
from pet import Pet,Dog
from ninja import Ninja
    
my_treats = ["salmon","potato","apple"] 
my_pet_food=["pizza","burger"]      

nibbles = Pet("Mr. Nibbles","Horse",['nibbles on things','is invisible'],"Hey Hey")

labrador =Dog("Fox",["Dangerous"],"Woof! Woof!")




adrien = Ninja("Adrien","Dion",my_treats,my_pet_food, nibbles)
mehdi = Ninja("Mehdi","Kamoun",my_treats,my_pet_food,labrador)

mehdi.feed()

adrien.feed()
print(my_pet_food)
adrien.feed()
print(my_pet_food)
adrien.feed()
adrien.walk()

