"""
Ian Marler
1/24/2022
Standard Deviation Calculator
"""

import math
from math_util import basic

if __name__ == "__main__":
    sample = (6, 5, 5, 5, 3, 2, 3, 6, 2, 2, 5, 4, 3, 3, 4, 2, 5, 3, 4, 5)
    mean = basic.mean(sample)
    
    temp = []
    for number in sample:
        temp.append(math.pow(number - mean, 2))
    
    standard_deviation = math.sqrt(basic.mean(temp))
    print("Sample Mean: " + str(mean))
    print("Standard Deviation: {0} or {0:.2f}".format(standard_deviation))

def standard_deviation(sample):
    mean = basic.mean(sample)
    
    temp = []
    for number in sample:
        temp.append(math.pow(number - mean, 2))
    
    return math.sqrt(basic.mean(temp))