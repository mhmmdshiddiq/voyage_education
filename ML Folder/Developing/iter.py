# from itertools import product

# # Array input length
# array_length = 8

# # Values to fill the array (excluding 5)
# values = [1, 2, 3, 4]

# # Generate all combinations of the values for the remaining positions
# remaining_combinations = list(product(values, repeat=array_length - 3))

# # Iterate through all combinations and insert 5 in three positions
# for comb in remaining_combinations:
#     array = [5] * 3 + list(comb)
#     print(array)

from itertools import combinations
import random

# Array input length
array_length = 8

# Values for the array
values = [1, 2, 3, 4]

# Number of positions to fill with 5
num_positions_5 = 7

# Generate all combinations of positions for the value 5
positions_combinations = list(combinations(range(array_length), num_positions_5))

# Iterate through all combinations and create arrays
for positions in positions_combinations:
    array = [5 if i in positions else random.choice(values) for i in range(array_length)]
    print(array)
