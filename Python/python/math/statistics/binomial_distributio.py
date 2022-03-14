import math_util.basic as basic
import math






#https://qr.ae/pGQV8F
#The probability of something happening k times in n tries is given by the Binomial distribution - Wikipedia, with probability p for each try.



if __name__ == '__main__':
	k = 3 #Happen this amount of times
	n = 3 #in this amount of tries
	p = 0.3 #probability (decimal format) of thing happening
	
	part1 = basic.factorial(n) / (basic.factorial(k) * basic.factorial(n - k))
	part2 = math.pow(p, k)
	part3 = math.pow(1 - p, n - k)
	
	total = part1 * part2 * part3
	
	print("{:.3f}".format(total))




def exact_amount(k, n, p, round=0):
	"""
	:param k:
		Number of successes
		:type k: int
	:param n:
		Amount of Tries
		:type n: int
	:param p:
		Probability (decimal format) of success
		:type p: float
	:param round:
		Specifies the amount of decimals to round to
		:type round: int
	:return:
	"""
	part1 = basic.factorial(n) / (basic.factorial(k) * basic.factorial(n - k))
	part2 = math.pow(p, k)
	part3 = math.pow(1 - p, n - k)
	
	total = part1 * part2 * part3
	
	if round != 0:
		preFormat = "{:." + str(round) + "f}"
		return float(preFormat.format(total))
	else:
		return total

def at_least_once(n, p, round=0):
	"""
	:param n:
		Amount of Tries
		:type n: int
	:param p:
		Probability (decimal format) of success
		:type p: float
	:param round:
		Specifies the amount of decimals to round to
		:type round: int
	:return:
	"""
	total = 0.0
	
	for k in range(1, n + 1):
		total += exact_amount(k, n, p)
	
	if round != 0:
		preFormat = "{:." + str(round) + "f}"
		return float(preFormat.format(total))
	else:
		return total
	
	
