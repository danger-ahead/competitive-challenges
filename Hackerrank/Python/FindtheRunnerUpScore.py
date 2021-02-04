if __name__ == '__main__':
    n = int(input())
    arr = list(map(int, input().split()))

    arr.sort()

    check = arr[len(arr) - 1]
    leng = len(arr) - 1
    while leng > 0:
        if check == arr[leng]:
            arr.remove(arr[leng])
        leng -= 1

    print(arr[len(arr) - 1])
