"""
print('*')
print('**')
print('***')

# variable_name = value
username = 'John Doe'
#int
num=1
print(num)
#float
num=1.0
print(num)
#boolean
is_true = True  #or False
username =input("Enter your name: ")
#string literal
print("Hello", username,"!")
#string concatenation
print("Hello " + username + "!")
#arithmetic operators
print(10 + 5)            # addition            10+5 -> 15
print(10 - 5)            # subtraction            10-5 -> 5
print(10 * 5)            # multiplication        10*5 -> 50
print(10 / 5)            # division            10/5 -> 2
print(10 % 5)            # remainder            10%5 -> 0
print(10 // 5)           # floor division        10/5 -> 2
print(10 ** 5)           # exponent             10^5 -> 100000
#assignment operators
x = 10  # x = 10            10
x += 5      # x = x + 5      15
x -= 5      # x = x - 5      10
x *= 5      # x = x * 5      50
x /= 5      # x = x / 5      10
x %= 5      # x = x % 5      0
x //= 5     # x = x // 5     2
x **= 5     # x = x ** 5     100000
#comparison operators
print(10 == 5)  # False
print(10 != 5)  # True
print(10 > 5)   # True
print(10 < 5)   # False
print(10 >= 5)  # True
print(10 <= 5)  # False
#logical operators
print(True and False)   # False
print(True or False)    # True
print(not True)         # False
#bitwise operators
print(10 & 5)
print(10 | 5)
print(10 ^ 5)
print(~10)
print(10 << 2)
print(10 >> 2)
#membership operators
print('a' in 'apple')   # True
print('a' not in 'apple')   # False
#identity operators
print(10 is 10)   # True
print(10 is not 10)   # False
#functions
print(abs(-5))
print(max(1, 2, 3))
print(min(1, 2, 3))
print(pow(2, 3))    # 2^3 = 8
print(round(2.5))
print(round(2.5, 1))    # round to 1 decimal place  2.5 -> 2.6
print(sum([1, 2, 3]))   # 6 = 1 + 2 + 3       [1, 2, 3] -> 6
print(round(3.5))   # 4 -> 4.0            3.5 -> 3.0
print(round(4.5))   # 5 -> 4.0            4.5 -> 5.0
#expressions
print(1 + 2 * 3)    # 7
#if-else statement
raining = True
if (raining):
    print("Take an umbrella")
else:
    print("No need for an umbrella")
#for loop
word = "Hello World"
for i in word:
    print(i)
#while loop
i = 0
while i < 5:
    print(i)
    i += 1
#break statement
print('break statement')
i = 0
while True:
    print(i)
    if i == 5:
        break
    i += 1
#list
numbers = [1, 2, 3, 4, 5]
print(numbers)
#slice
print(numbers[1:4])
#tuple
numbers = (1, 2, 3, 4, 5)
print(numbers)
#set
numbers = {1, 2, 3, 4, 5}
print(numbers)
#dictionary
numbers = {1: 'one', 2: 'two', 3: 'three', 4: 'four', 5: 'five'}
print(numbers)
#temp loop ferenheit to celsius
for f in range(0, 101, 10):
    c = (f - 32) * 5/9
    print(int(f), "Fahrenheit is", int(c), "Celsius")
# tuples
lotto_numbers = (32, 65, 53)
# lotto_numbers[2] = 9   #'tuple' object does not support item assignment
# convert tuple to list
lotto_numbers = list(lotto_numbers)
lotto_numbers[2] = 9
print(lotto_numbers)
# dictionary
my_dic = {
    'ser': {'sdf': 'swe', 'sde': 'ser'}
}
print(my_dic['ser']['sdf'])
print(my_dic.get('ser').get('sde'))
# defining a function


def say_hello():
    print("hello")


say_hello()


def new_fun():
    print('world')


new_fun()

# importing modules
import demo as d
myer = d.Employee("Millz", 188000)
print(myer.__dict__)

print(myer.name)            # Millz

print(myer.salary)          # 188000
or
from demo import Employee

myer = Employee("Millz", 188000)
print(myer.__dict__)

print(myer.name)            # Millz

print(myer.salary)          # 188000

"""
