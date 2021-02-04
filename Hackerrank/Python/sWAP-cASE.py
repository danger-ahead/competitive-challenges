def swap_case(s):
    s2 = ''
    for character in s:
        truefalse = character.isupper()
        if truefalse:
            character = character.lower()
            s2 = s2 + character
        else:
            character = character.upper()
            s2 = s2 + character

    return s2


if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)
