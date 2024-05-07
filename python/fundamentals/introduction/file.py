

num1 = 42 #variable declaration - initialize integer
num2 = 2.3 #variable declaration - initialize float 
boolean = True #variable declaration - initialize Boolean 
string = 'Hello World' #variable declaration - initialize string
 #variable declaration - initialize list
pizza_toppings = ['Pepperoni', 'Sausage', 'Jalepenos', 'Cheese', 'Olives']
#variable declaration - initialize dictionary
person = {'name': 'John', 'location': 'Salt Lake', 'age': 37, 'is_balding': False}
#variable declaration - initialize tuple
fruit = ('blueberry', 'strawberry', 'banana')

#type check print to console
print(type(fruit))

# print to console  list access value
print(pizza_toppings[1])

#add value to the list pizza_toppings
pizza_toppings.append('Mushrooms')

#print to console  dictionary access value
print(person['name'])

#dictionary change value
person['name'] = 'George'

#dictionary add value
person['eye_color'] = 'blue'

#print to console  tuple access value
print(fruit[2])

# Conditional if, evaluation, print to console, Conditional else, print to console
if num1 > 45:
    print("It's greater")
else:
    print("It's lower")


# Conditional if - elif - else, print to console.
if len(string) < 5:
    print("It's a short word!")
elif len(string) > 15:
    print("It's a long word!")
else:
    print("Just right!")


# For Loop start at 0 and goes up to until 5
for x in range(5):
    print(x)


# For Loop start at 2 and goes up to until 5
for x in range(2,5):
    print(x)

# For Loop start at 2 and goes up to until 10 increment by 3
for x in range(2,10,3):
    print(x)

#While Loop, variblae declaration
x = 0
while(x < 5):
    print(x)
    x += 1


# delete value at end on list
pizza_toppings.pop()
# delete value on list at index
pizza_toppings.pop(1)

# print to console of dictionary
print(person)

# Dictionary delete value
person.pop('eye_color')

# print to console of dictionary
print(person)

# for loop through a list
for topping in pizza_toppings:
    if topping == 'Pepperoni':
        continue
    print('After 1st if statement')
    if topping == 'Olives':
        break


# function declaration
def print_hello_ten_times():
    for num in range(10):
        print('Hello')

#call function
print_hello_ten_times()


# function Declaration with parameter x
def print_hello_x_times(x):
    for num in range(x):
        print('Hello')

#call function with parameter 4
print_hello_x_times(4)


# function declaration with default parameter
def print_hello_x_or_ten_times(x = 10):
    for num in range(x):
        print('Hello')

# Function call goes to 10
print_hello_x_or_ten_times()

# Function call goes to 4
print_hello_x_or_ten_times(4)


"""
Bonus section
"""

# print(num3)
# num3 = 72
#fruit[0] = 'cranberry'
# print(person['favorite_team'])
# print(pizza_toppings[7])
#   print(boolean)
# fruit.append('raspberry')
# fruit.pop(1)