from functools import reduce

if __name__ == '__main__':
    n = int(input())
    student_marks = {}
    for _ in range(n):
        line = input().split()
        name = line[0]
        scores = line[1:]
        scores = map(float, scores)
        student_marks[name] = scores
    query_name = input()

    marks = student_marks[query_name]

    totalmarks = reduce(lambda a, b: a + b, marks)

    print("{0:.2f}".format(totalmarks / 3))
