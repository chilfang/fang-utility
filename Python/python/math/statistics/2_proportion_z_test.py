import math

"""
2 Proportion Z Test
p1 = proportion 1 (5/20)
p2 = proportion 2 (7/25)

n1 = p1 sample size (20)
n2 = p2 sample size (25)

p = sample proportion ((5 + 7) / (20 + 25))

z = (p1 - p2) / sqrt(p(1 - p)(1/n1 + 1/n2))

"""

p1 = 48  # Sample 1 Number of Successes
n1 = 100  # Sample 1 Size
por1 = p1 / n1

p2 = 59  # Sample 2 Number of Successes
n2 = 100  # Sample 2 Size
por2 = p2 / n2  # Percent of Success

p = ((p1 + p2) / (n1 + n2))


part1 = p1 - p2
part2 = math.sqrt(p * (1 - p) * ((1/n1) + (1/2)))


print("por1: " + str(por1))
print("por2: " + str(por2))
print("p: {:.4f}".format(p))
print(part1 / part2)