class Pet: 
    def __init__(self,name,type,tricks,noise):
        self.name=name
        self.type=type
        self.tricks=tricks
        self.health=80
        self.energy=50
        self.noise=noise
    
    def sleep(self):
        self.energy+=25
        return self
    
    def eat(self):
        self.energy+=5
        self.health+=10
        return self
    
    def play(self):
        self.health+=5
        return self
    
    def noise(self):
        print(self.noise)


class Dog(Pet):
    def __init__(self,name,tricks,noise):
        super().__init__(name,"Dog",tricks,noise)
        self.energy=100
        self.health=50
        
      
    
    def eat(self):
        super().eat()
        print("I like eat Bones")
        

if __name__=="__main__":
    print("the file is being executed directly")
else : 
    print(f"the file is imported by another file called :{__name__}")