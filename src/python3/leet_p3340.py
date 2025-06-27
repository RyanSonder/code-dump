#!/usr/bin/env python3
# LeetCode Problem 3340 - Check Balanced String
# https://leetcode.com/problems/check-balanced-string/
# 2024-11-09

def isBalanced(self, num: str) -> bool:
    tmp = 0
    for char in num:
        tmp = -(tmp + int(char))
    return tmp == 0