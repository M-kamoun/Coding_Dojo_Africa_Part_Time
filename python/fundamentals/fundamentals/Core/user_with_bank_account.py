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

    def make_deposit(self,amount):
            self.account.deposit(amount)
            return self
    
    #Add a make_withdrawal method to the User class that calls on its bank account's instance methods.
    
    def make_withdraw(self, amount):
        self.account.withdraw(amount)
        return self
    
    #Add a display_user_balance method to the User class that displays user's account balance
    
    def display_user_balance(self):
        self.account.display_account_info()
        return self
    
  
        
    def make_deposit_acc(self,account_name,amount):
        if account_name in self.user_account:
            balance=self.user_account[account_name]+amount
            self.user_account.update({account_name:balance})
        else : 
            self.user_account.update({account_name:amount})
        
        return self
    
    

    def make_withdraw_acc(self, account_name,amount):
        
        if account_name in self.user_account:
            balance=self.user_account[account_name]
            if self.user_account[account_name]-amount >0:
                self.user_account.update({account_name:balance-amount})
            else: 
                print(f"Insufficient funds: Charging a $5 fee")
                balance-=5
                self.user_account.update({account_name:balance})
        else:
            print("this account is not exist")
        
        # self.account.withdraw(amount)
        return self

    def display_user_account(self):
        for key,val in self.user_account.items():
            print(f"User : {self.name}, {key} Balance : {val}")
        return self
  
  

user_1=User("mehdi","Kamoun@gmail.com")
user_1.make_deposit(200).make_deposit(400).make_withdraw(100).display_user_balance()

print("*"*40)
user_1.make_deposit_acc("Ckeckings",200).make_deposit_acc("Savings",300).make_deposit_acc("Savings",100).make_deposit_acc("Ckeckings",50).make_withdraw_acc("Savings",100).display_user_account()


