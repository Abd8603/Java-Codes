import numpy as np 
 
def find_widest_valley(n, A, B): 
    def surface_equation(x): 
        return sum(np.sin(a*x + b) for a, b in zip(A, B)) 
 
    def find_local_maxima(): 
        maxima = [] 
        for i in range(1, n-1): 
            if surface_equation(i-1) < surface_equation(i) > surface_equation(i+1): 
                maxima.append(i) 
        return maxima 
 
    def find_valley_width(left, right): 
        return right - left 
 
    maxima = find_local_maxima() 
    widest_valley_width = 0 
    widest_valley_index = 0 
 
    for i in range(len(maxima)-1): 
        left_maxima = maxima[i] 
        right_maxima = maxima[i+1] 
        current_valley_width = find_valley_width(left_maxima, right_maxima) 
 
        if current_valley_width > widest_valley_width: 
            widest_valley_width = current_valley_width 
            widest_valley_index = left_maxima + 1 
 
    return widest_valley_index 
 
# Input parsing 
n = int(input()) 
A = list(map(int, input().split())) 
B = list(map(int, input().split())) 
 
# Output 
print(find_widest_valley(n,A,B))