class BankAccount:
    
 
    def __init__(self, int_rate, balance=0):
        self.int_rate=int_rate
        self.balance=balance
        # BankAccount.bank_account.append(self)
    
    def display_account_info(self):
        print(f"Balance : ${self.balance}")
        return self
    
    def deposit(self,amount):
        self.balance+=amount
        return self
    
    def withdraw(self, amount):
        if self.balance - amount >0 :
            self.balance-=amount
        else: 
            print(f"Insufficient funds: Charging a $5 fee")
            self.balance-=5
        return self
    
    def yield_interest(self):
        if self.balance>0:
            self.balance+=  (self.balance*self.int_rate)
        return self
    
    @classmethod
    def print_all_instances(cls):
        for account in cls.bank_account:
            account.display_account_info()

#----------------Class USER-----------------------------------
class User:
    
    
    
#Create a User class with an __init__ method    
    def __init__(self, name, email):
        self.name = name
        self.email = email
        self.account = BankAccount(int_rate=0.02, balance=0)
        self.user_account={}
       

        
#Add a make_deposit method to the User class that calls on its bank account's instance methods.

    def make_deposit(self,acc_name,amount):
        if acc_name in self.user_account:
            balance=self.user_account[acc_name]
            self.user_account.update({acc_name:balance+amount})
        else:
            self.account.balance=0
            self.user_account.update({acc_name:self.account.deposit(amount).balance})
            
        return self
    
    #Add a make_withdrawal method to the User class that calls on its bank account's instance methods.
    
    def make_withdraw(self, acc_name,amount):
        if acc_name in self.user_account:
            self.account.balance=self.user_account[acc_name]
            self.user_account.update({acc_name:self.account.withdraw(amount).balance})
        else:
            print("account not exist")
        return self
    
    #Add a display_user_balance method to the User class that displays user's account balance
    
    def display_user_balance(self):
        self.account.display_account_info()
        return self
    
  
    def display_user_account(self):
        for key,val in self.user_account.items():
            print(f"User : {self.name}, {key} Balance : {val}")
        return self
    
    def transfer_money(self,other_user,amount):
        if other_user.name:
            key="checkings"
            
            if amount-self.user_account[key] <0:
                other_user.user_account[key]+=amount
                print(f"Success! amount : {amount} Transfer to Account : {other_user.name}")
            else : 
                print("Sorry ! Insufficient funds")
            
        return self
    
    

user_1=User("Mehdi ","Kamoun@gmail.com")
user_1.make_deposit("checkings",200).make_deposit("savings",300).make_deposit("checkings",600).make_deposit("savings",1500).display_user_account()

user_2=User("Mouna  ","Mouna@gmail.com")
user_2.make_deposit("checkings",3200).make_deposit("savings",5200).display_user_account()
user_1.transfer_money(user_2,200)
user_2.display_user_account()


# user_1.make_deposit(200).make_deposit(400).make_withdraw(100).display_user_balance()

# # print("*"*40)
# # user_1.make_deposit_acc("Ckeckings",200).make_deposit_acc("Savings",300).make_deposit_acc("Savings",100).make_deposit_acc("Ckeckings",50).make_withdraw_acc("Savings",100).display_user_account()
# user_1=User("mehdi","Kamoun@gmail.com")
# user_2=User("amine","amine@gmail.com")

# user_2.make_deposit_acc("Savings",100).display_user_account()
# user_1.make_deposit_acc("Ckeckings",200).make_deposit_acc("Savings",300).display_user_account()
# user_1.make_deposit(300).display_user_balance()
