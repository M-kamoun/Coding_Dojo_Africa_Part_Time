# import card
from card import *
import random

class Deck:


    def __init__( self ):
        suits = [ "spades" , "hearts" , "clubs" , "diamonds" ]
        self.cards = []
        ranks = [
                {"rank": "A", "value": 11},
                {"rank": "2", "value": 2},
                {"rank": "3", "value": 3},
                {"rank": "4", "value": 4},
                {"rank": "5", "value": 5},
                {"rank": "6", "value": 6},
                {"rank": "7", "value": 7},
                {"rank": "8", "value": 8},
                {"rank": "9", "value": 9},
                {"rank": "10", "value": 10},
                {"rank": "J", "value": 10},
                {"rank": "Q", "value": 10},
                {"rank": "K", "value": 10},
            ]
        for suit in suits:
            for rank in ranks:
                self.cards.append(Card(suit, rank))

        # for s in suits:
        #     for i in range(1,14):
        #         str_val = ""
        #         if i == 1:
        #             str_val = "Ace"
        #         elif i == 11:
        #             str_val = "Jack"
        #         elif i == 12:
        #             str_val = "Queen"
        #         elif i == 13:
        #             str_val = "King"
        #         else:
        #             str_val = str(i)
        #         self.cards.append( card.Card( s , i , str_val ) )

    def show_cards(self):
        for card in self.cards:
            print(card)
    
    def shuffle(self):
        if len(self.cards) > 1:
            random.shuffle(self.cards)
    

deck_1=Deck()
deck_1.show_cards()
print("*" * 40)
deck_1.shuffle()
deck_1.show_cards()