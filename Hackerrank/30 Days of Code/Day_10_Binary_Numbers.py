if __name__ == '__main__':
    n = int(input())
    binary = ''
    while n > 0:
        if n % 2 == 0:
            binary = '0' + binary
            n = n // 2
        else:
            binary = '1' + binary
            n = n // 2

    counts = []
    count = 0
    for i in range(0, len(binary)):
        if binary[i] == '1':
            count = count + 1
        else:
            counts.append(count)
            count = 0
        counts.append(count)

    counts.sort(reverse=True)

    print(counts[0])
