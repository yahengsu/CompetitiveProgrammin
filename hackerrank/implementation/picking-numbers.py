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
    a.sort()
    for i in range(0, len(a)):
        a_max = 0
        a_min = a[i]
        for j in range(i, len(a)):
            if abs(a[j] - a_min) <= 1:
                a_max += 1
            else:
                break
            if a[j] < a_min:
                a_min = a[j]
        if a_max > numbers:
            numbers = a_max

    return numbers
