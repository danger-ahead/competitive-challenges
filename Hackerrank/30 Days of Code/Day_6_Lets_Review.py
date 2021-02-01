T = int(input())


def printit(S):
    Seven = ""
    Sodd = ""
    Seven = Seven + S[::2]
    Sodd = Sodd + S[1::2]
    print(Seven, Sodd)


for i in range(T):
    S = input()
    printit(S)

# Task
# Given a string, S, of length N that is indexed from 0 to N-1, print its even-indexed and odd-indexed characters
# as 2 space-separated strings on a single line (see the Sample below for more detail).
# Note: 0 is considered to be an even index.

# Input Format
# The first line contains an integer, T (the number of test cases).
# Each line i of the subsequent lines contain a String, S.

# Sample Input
# 2
# Hacker
# Rank

# Sample Output
# Hce akr
# Rn ak
