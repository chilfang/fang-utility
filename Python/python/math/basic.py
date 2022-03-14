"""
Ian Marler
1/24/2022
Basic Formulas that don't merit their own file
"""

import math

def mean(array):
    """
    Paremeters
    --------------------
    list - Collection of numbers
        An array of numbers that the mean is calculated of
    return
        returns the mean of the list
    """
    
    total = 0
    for number in array:
        total += number
    
    return total / len(array)


def round_to_closer(sample, lower, higher, round_up=True):
    distance_from_lower = abs(lower - sample)
    distance_from_higher = abs(higher - sample)
    
    """
    If the sample is closer to the lower bound then return lower
    If the sample is closer to the higher bound then return higher
    If the sample is in the middle then return higher unless otherwise specified
        #yes this could be shorter but readability yknow?
    """
    if distance_from_lower < distance_from_higher:
        return lower
    elif distance_from_higher < distance_from_lower:
        return higher
    else:
        if round_up:
            return higher
        else:
            return lower
        
def round_to(number, digits):
    if digits > 0:
        number /= math.pow(10, digits)
        number = int("{:.0f}".format(number))
        number *= math.pow(10, digits)
        return int(number)
    
    elif digits < 0:
        limit = "{:." + str(digits * -1) + "f}"
        return float(limit.format(number))
    
    else:
        return int("{:.0f}".format(number))



def factorial(number):
    total = 1
    for i in range(1, number + 1):
        total *= i
    
    return total

def digit_count(number):
    digits = 0
    
    if type(number) == int:
        while number != 0:
            digits += 1
            number = int(number / 10)
    elif type(number) == float:
        number = int(str(number).replace(".", ""))
        while number != 0:
            digits += 1
            number = int(number / 10)
            
    else:
        raise TypeError("Input is not a number.")
    
    #if input is 0 display number as having 1 digit
    return digits if digits != 0 else 1


