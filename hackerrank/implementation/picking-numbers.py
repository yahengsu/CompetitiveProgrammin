#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'pickingNumbers' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY a as parameter.
#

def pickingNumbers(a):
    # Write your code here
    numbers = 0

    for i in range(0,len(a)):
        max = 0
        for j in range(0, len(a)):
            if i != j:
                if abs(a[i] - a[j]) <= 1:
                    max += 1
        if max > numbers:
            numbers = max
            
    return numbers
if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    a = list(map(int, input().rstrip().split()))

    result = pickingNumbers(a)

    fptr.write(str(result) + '\n')

    fptr.close()
