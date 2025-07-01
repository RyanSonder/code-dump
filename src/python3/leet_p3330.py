#!/usr/bin/env python3
# LeetCode Problem 3330 - Find the Original Typed String I
# https://leetcode.com/problems/find-the-original-typed-string-i/
# 2025-07-01

class Solution:
    def possibleStringCount(self, word: str) -> int:
        last = ''
        count = 0
        for char in word:
            if char == last:
                count += 1
            last = char 
        return count + 1


