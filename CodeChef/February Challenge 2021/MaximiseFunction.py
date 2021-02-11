t = int(input())

while (t > 0):
    N = int(input())
    inpu = [N]
    inpu = list(map(int, input().split()))
    
    inpu.sort()
    
    max = inpu[len(inpu)-1]
    min = inpu[0]
            
    print(2*max - 2*min)
    
    t = t - 1