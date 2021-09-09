import numpy as np 

class Exercises :
    def suma_matrices(a,b):
        result = []
        for i,j in (a):
            res = i+j
            result.append(res)
        return result

a = np.random.randint(10, size=(3,2))
b = np.random.randint(10, size=(3,2))
print (a)
print (b)
print (Exercises.suma_matrices(a,b))


