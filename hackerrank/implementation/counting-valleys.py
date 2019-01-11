#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the countingValleys function below.
def countingValleys(n, s):
    count = 0
    level = 0
    down = False
    for a in s:
        if a == "U":
            level += 1
        elif a == "D":
            level-= 1
        if level < 0:
            down = True
        if level == 0 and down:
            count += 1
            down = False
    return count
    return count
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input())

    s = input()

    result = countingValleys(n, s)

    fptr.write(str(result) + '\n')

    fptr.close()
