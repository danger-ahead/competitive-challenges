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
