def min(x):
    ans = 0
    if "AM" in x:
        if x[:2]!="12":
            ans = int(x[:2])*60 + int(x[3:5])
        else:
            ans = int(x[3:5])
    else:
        if x[:2]!="12":
            ans = (int(x[:2])+12)*60 + int(x[3:5])
        else:
            ans = 720 + int(x[3:5])
            
    return ans

for t in range(int(input())):
    s = ''
    time = input()
    time = min(time)
    for i in range(int(input())):
        timeprd = input()
        timeprd1 = min(timeprd[:8])
        timeprd2 = min(timeprd[9:])
        
        if timeprd1 <= time <= timeprd2:
            s += '1'
        else:
            s += '0'
    
    print(s)