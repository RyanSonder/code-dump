#!/usr/bin/bash
# LeetCode Problem 195 - Tenth Line
# https://leetcode.com/problems/tenth-line/
# 2025-06-27

mapfile -t -s 9 -n 1 line_10 < 'file.txt'; echo "${line_10[0]}"