#!/usr/bin/bash
# LeetCode Problem 192 - Word Frequency
# https://leetcode.com/problems/word-frequency/
# 2025-06-28

declare -A freq

while read -r line; do 
    for word in $line; do 
        ((freq["$word"]++))
    done
done < words.txt

for key in "${!freq[@]}"; do 
    echo "$key ${freq[$key]}"
done | sort -k2 -nr