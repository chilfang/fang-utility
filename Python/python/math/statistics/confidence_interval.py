from math_util.statistics.helper import z_table
from math_util.statistics.helper import t_table
from math_util.statistics.standard_deviation_calculator import standard_deviation
import math
from math_util import basic
from math_util.basic import digit_count as count


option = 2


if option == 1:
	sample = (2.2, 2.4, 3.1, 3.4, 3.5, 3.8, 4.0, 4.2, 4.5, 4.6, 5.0, 5.1, 5.3, 5.3, 5.4, 5.6, 5.8, 5.9, 6.3, 6.4, 6.6, 6.7, 6.8, 7.1, 7.2)
	
	mean = basic.mean(sample)
	sd = standard_deviation(sample)
	
	mean = 5.05
	sd = 1.45
	size = len(sample)
	zed = .98
	
	#x̄ ± z* σ/√n
	
	middle = z_table.get_z_score(zed) * (sd / math.sqrt(size))
	
	print(mean + middle)
	print(mean - middle)

elif option == 2:
	"""
	Confidence interval = (p1 – p2) +/- z*√(p1(1-p1)/n1 + p2(1-p2)/n2)
	
	where:
	p1, p2: sample 1 proportion, sample 2 proportion
	z: the z-critical value based on the confidence level
	n1, n2: sample 1 size, sample 2 size
	
	n1 (sample 1 size)
	100
	p1 (sample 1 proportion)
	0.62
	n2 (sample 2 size)
	100
	p2 (sample 2 proportion)
	0.46
	Confidence level
	0.95
	
	95% C.I. = [0.0236, 0.2964]
	"""
	
	
	#This is all terribly messed up, but it works
	p1 = 24  # Sample 1 Proportion (Number of Successes)
	n1 = 60 #Sample 1 Size
	por1 = p1 / n1
	
	p2 = 21  # Sample 2 Proportion (Number of Successes)
	n2 = 70 #Sample 2 Size
	por2 = p2 / n2 # Percent of Success
	
	confidence_level = .99 #Zed
	zed = t_table.get_one_tail(confidence_level, 0)
	
	
	#(p1 – p2) +/- z*√(p1(1-p1)/n1 + p2(1-p2)/n2)
	
	#p1 – p2
	middle = p1 - p2
	
	#z*√(p1(1-p1)/n1 + p2(1-p2)/n2)
	offset = zed * math.sqrt(((por1 * (1 - por1)) / n1) + ((por2 * (1 - por2)) / n2))
	
	
	print(middle + offset)
	print(middle - offset)
	print()
	
	"""
	space1 = max(max(count(p1), count(n1)), max(count(p2), count(n2)))
	
	print("({0}{2} {1})     {3}    /({0}(1-{0})   ({1}(1-{1}))".format(p1, p2, " " * space1, " " * (count(z_score) + 2)))
	print("({0} - {0}) +/- {1} * / ({0}---{0}- + {0}-----{0})".format("-" * space1, z_score))
	print("({0}{2} {1})     {3}  √  ({4}{0}{4}  {5}{1}{5})".format(n1, n2, " " * space1, " " * (count(z_score) + 2), " " * (count(p1) + 1), " " * (count(p2) + 2)))
	"""
	
	print("({0} – {1}) +/- {4} * √({0}(1-{0})/{2} + {1}(1-{1})/{3})".format(por1, por2, n1, n2, zed))