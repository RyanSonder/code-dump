#!/usr/bin/env python3
# Project Euler Problem 1 - Multiples of 3 or 5
# https://projecteuler.net/problem=1
# 2025-06-26

sum = 0
for num in range(3, 1000, 3):
    sum += num
for num in range(5, 1000, 5):
    sum += num
for num in range(15, 1000, 15):
    sum -= num
print(sum)