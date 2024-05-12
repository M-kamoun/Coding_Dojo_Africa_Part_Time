

def countdown(num):
    list=[]
    for i in range(num,-1,-1):
        list.append(i)
    return list

print(countdown(10))

print ("#"*40)




def print_and_return(list):
    print (f"this value is print by function {list[0]}")
    return list[1]

print(print_and_return([10,5]))

print ("#"*40)


def first_plus_len(list):
    return list[0]+len(list)

print(first_plus_len([10,2,3,4,5,6,7,12,52]))

print ("#"*40)


def value_greater_than_second(list):
    if len(list)<2:
        return False
    new_list=[]
    for i in range(0,len(list)):
        if list[i]>list[1]:
            new_list.append(list[i])
    print(len(new_list))
    return new_list


print(value_greater_than_second([5,2,3,2,1,4]))

print ("#"*40)

def this_length_that_value(size,value):
    new_list=[]
    for i in range(0,size):
        new_list.append(value)
    return new_list

print(this_length_that_value(4,7))
print(this_length_that_value(6,2))








