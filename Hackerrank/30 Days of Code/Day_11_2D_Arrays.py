#!/bin/python3
def _get_sum(grid, row, column):
    sum = 0
    sum += grid[row - 1][column - 1]
    sum += grid[row - 1][column]
    sum += grid[row - 1][column + 1]
    sum += grid[row][column]
    sum += grid[row + 1][column - 1]
    sum += grid[row + 1][column]
    sum += grid[row + 1][column + 1]
    return sum


if __name__ == '__main__':
    arr = []

    for _ in range(6):
        arr.append(list(map(int, input().rstrip().split())))

    max_sum = -63
    for i in range(1, 5):
        for j in range(1, 5):
            current_sum = _get_sum(arr, i, j)
            if current_sum > max_sum:
                max_sum = current_sum

    print(max_sum)
