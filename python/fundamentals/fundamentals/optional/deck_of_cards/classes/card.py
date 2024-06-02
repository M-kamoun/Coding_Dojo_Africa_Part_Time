class Card:

    def __init__( self , suit , rank ):
        
        self.suit = suit
        self.rank=rank
        # self.point_val = point_val
        # self.string_val = string_val

    def __str__(self):
        return f"{self.rank['rank']} of {self.suit}"
        

