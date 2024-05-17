
class BankAccount:
    
    bank_account = []
    
    # don't forget to add some default values for these parameters!
    def __init__(self, int_rate, balance=0):
        self.int_rate=int_rate /100 
        self.balance=balance
        BankAccount.bank_account.append(self)
    
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




my_account_1 = BankAccount(1,1000)
my_account_2 = BankAccount(1,5000)

print("#"*40)
my_account_1.deposit(20).deposit(100).deposit(50).withdraw(100).yield_interest().display_account_info()
my_account_2.deposit(100).deposit(70).withdraw(150).withdraw(20).withdraw(100).yield_interest().display_account_info()
print("#"*40)
BankAccount.print_all_instances()

print("#"*40)



