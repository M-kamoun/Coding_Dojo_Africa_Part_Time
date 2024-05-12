x = [ [5,2,3], [10,8,9] ] 
students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
    'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
    'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]

#Update Values in Dictionaries and Lists
x[1][0]=15
print(x)

students[0]["last_name"]="Briant"
print(students)

sports_directory['soccer'][0]="Andres"
print(sports_directory)


z[0]["y"]=30
print(z)

#Iterate Through a List of Dictionaries
print("*"*20)
students = [
         {'first_name':  'Michael', 'last_name' : 'Jordan'},
         {'first_name' : 'John', 'last_name' : 'Rosales'},
         {'first_name' : 'Mark', 'last_name' : 'Guillen'},
         {'first_name' : 'KB', 'last_name' : 'Tonel'}
    ]


def iterateDictionary(list) :
    for i in range(0,len(list)):
        value=""
        for key, val in list[i].items():
            value+=f"{key} - {val},"
        print(value)    
        
iterateDictionary(students) 
# should output: (it's okay if each key-value pair ends up on 2 separate lines;
# bonus to get them to appear exactly as below!)
# first_name - Michael, last_name - Jordan
# first_name - John, last_name - Rosales
# first_name - Mark, last_name - Guillen
# first_name - KB, last_name - Tonel


#Get Values From a List of Dictionaries

def iterateDictionary2(key_name, list):
    for i in range(0,len(list)):
        print(list[i][key_name])
        


iterateDictionary2("first_name", students)
iterateDictionary2("last_name", students)

#Iterate Through a Dictionary with List Values

def printInfo(dict):
    for key,value in dict.items():
        # print(str(len(value)) +" "+key)
        print(f"\033[35m {len(value)}\033[00m {key.upper()}")
        for i in range(0,len(value)):
            print(value[i])
 
    
    
 
dojo = {
   'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
   'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}
printInfo(dojo)

