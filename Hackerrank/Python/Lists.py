if __name__ == '__main__':
    N = int(input())

    listL = []
    for i in range(N):
        user_input = input().split(" ")

        if user_input[0] == "insert":
            listL.insert(int(user_input[1]), int(user_input[2]))
        elif user_input[0] == "pop":
            listL.pop()
        elif user_input[0] == "print":
            print(listL)
        elif user_input[0] == "sort":
            listL.sort()
        elif user_input[0] == "remove":
            listL.remove(int(user_input[1]))
        elif user_input[0] == "append":
            listL.append(int(user_input[1]))
        elif user_input[0] == "reverse":
            listL.reverse()

# Consider a list (list = []). You can perform the following commands:

# 1. insert i e: Insert integer e at position i.
# 2. print: Print the list.
# 3. remove e: Delete the first occurrence of integer.
# 4. append e: Insert integer e at the end of the list.
# 5. sort: Sort the list.
# 6. pop: Pop the last element from the list.
# 7. reverse: Reverse the list.

# Initialize your list and read in the value of n
# followed by n lines of commands where each command will be of the 7 types listed above. Iterate through each command
# in order and perform the corresponding operation on your list.


# Sample Input 0

# 12
# insert 0 5
# insert 1 10
# insert 0 6
# print
# remove 6
# append 9
# append 1
# sort
# print
# pop
# reverse
# print

# Sample Output 0

# [6, 5, 10]
# [1, 5, 9, 10]
# [9, 5, 1]
