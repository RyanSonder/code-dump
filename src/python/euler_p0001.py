#!/usr/bin/env python3

# Project Euler Problem 1 - Multiples of 3 or 5

sum = 0
for i in (range(1000)):
    if i % 3 == 0 and i % 5 == 0 or i % 5 == 0 or i % 3 == 0:
        sum += i
print(sum)