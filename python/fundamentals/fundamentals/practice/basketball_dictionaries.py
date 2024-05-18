players = [
    {
    	"name": "Kevin Durant", 
    	"age":34, 
    	"position": "small forward", 
    	"team": "Brooklyn Nets"
    },
    {
    	"name": "Jason Tatum", 
    	"age":24, 
    	"position": "small forward", 
    	"team": "Boston Celtics"
    },
    {
    	"name": "Kyrie Irving", 
    	"age":32, "position": "Point Guard", 
    	"team": "Brooklyn Nets"
    },
    {
    	"name": "Damian Lillard", 
    	"age":33, "position": "Point Guard", 
    	"team": "Portland Trailblazers"
    },
    {
    	"name": "Joel Embiid", 
    	"age":32, "position": "Power Foward", 
    	"team": "Philidelphia 76ers"
    },
    {
    	"name": "", 
    	"age":16, 
    	"position": "P", 
    	"team": "en"
    }
]


#Challenge 1: Update the Constructor
class Player:
    def __init__(self, my_dict):
        self.name = my_dict["name"]
        self.age = my_dict["age"]
        self.position = my_dict["position"]
        self.team = my_dict["team"]
        
    
    @classmethod
    def get_team(cls, my_dict):
        player_objects = []
        for dict in my_dict:
            player_objects.append(cls(dict))
        return player_objects
    
    
        

new_team=[]

player_1= Player(players[0])
player_2= Player(players[1])
player_3= Player(players[2])
print(f"Player : {player_1.name} was created!")
print(f"Player : {player_2.name} was created!")
print(f"Player : {player_3.name} was created!")



def display(list):
    for i in range(0,len(list)):
        print(f"Name: {list[i].name} -- Age : {list[i].age}-- Position : {list[i].position} -- team : {list[i].team}")


for i in range(0,len(players)):
    
    new_team.append(Player(players[i]))

display(new_team) 

print("#"*40)   

my_list = Player.get_team(players)
display(my_list)