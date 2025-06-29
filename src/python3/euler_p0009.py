#!/usr/bin/env python3
# Project Euler Problem 9 - Special Pythagorean Triplet
# https://projecteuler.net/problem=9
# 2025-06-28

import math

for a in range(1, 334):
    for b in range(a + 1, 667):
        if a + b + math.sqrt(a**2 + b**2) == 1000:
            print((int) (a * b * math.sqrt(a**2 + b**2)))