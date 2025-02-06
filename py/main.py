with open("users.txt", "r") as file:
    i = 0
    for line in file:
        i = i + int(line)

print(i)

with open("users.txt", "a") as file:
    file.write("\nTest")