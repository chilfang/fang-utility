"""
Ian Marler
1/24/2022
Z Score Finder/Helper
"""

import math
import helper.z_table as z_table

p = .92 #Success Chance
q = 0.08 #Failure Chance

success = 175 #Success Count
sample = 200 #Chances Count

alpha = math.sqrt((p * q) / sample)
cross = success / sample
zed = float("{:.2f}".format((cross - p) / alpha))
print("{:.4f} = sqrt(({} * {}) / {})".format(alpha, p, q, sample))
print("{} = {} / {}".format(cross, success, sample))
print("{} = ({} - {}) / {:.4f}".format(zed, cross, p, alpha))
print("p(z < {}) = {}".format(zed, z_table.get_z_score(zed)))








