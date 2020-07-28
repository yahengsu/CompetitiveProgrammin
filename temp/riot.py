#!/bin/python3

import math
import os
import random
import re
import sys



# Complete the 'PrintGardenLayoutWithIdealSeats' function below.
# garden = [y_pos][x_pos]
def maxFlowersAtSquare(garden, y_pos, x_pos):
    flowers = 0
    y = y_pos
    x = x_pos
    # CHECK TOP
    while y >= 0:
        e = garden[y][x_pos]
        if e == "W":
            break
        elif e == "F":
            flowers += 1
        y -= 1
    y = y_pos

    #CHECK BOTTOM
    while y <= len(garden)-1:
        e = garden[y][x_pos]
        if e == "W":
            break
        elif e == "F":
            flowers += 1
        y += 1
    y = y_pos


    #CHECK LEFT
    while x >= 0:
        e = garden[y_pos][x]
        if e == "W":
            break
        elif e == "F":
            flowers += 1
        x -= 1
    
    x = x_pos
    
    #CHECK RIGHT
    while x <= len(garden[y_pos]) - 1:
        e = garden[y_pos][x]
        if e == "W":
            break
        elif e == "F":
            flowers += 1
        x += 1

    return flowers

def PrintGardenLayoutWithIdealSeats():
    # Write your code here
    line = input().split(",")
    x = int(line[0])
    y = int(line[1])

    garden = [["B" for i in range(x)] for j in range(y)]
    maxFlowers = [[0 for i in range(x)] for j in range(y)]
    m_flowers = 0
    for line_t in sys.stdin:
        line = line_t.split(",")
        t = line[0]
        x_pos = int(line[1])
        y_pos = int(line[2])
        garden[y_pos][x_pos] = t
    # HAVE GARDEN NOW CHECK MAX FLOWERS
    for i in range(0, len(garden)):
        row = garden[i]
        for j in range(0, len(row)):
            if garden[i][j] == "B":
                maxFlowers[i][j] = maxFlowersAtSquare(garden, i, j)
                if maxFlowers[i][j] > m_flowers:
                    m_flowers = maxFlowers[i][j]
    # HAVE FLOWERS NOW ADD ASTERISK
    for i in range(0, len(garden)):
        for j in range(0, len(garden[i])):
            if maxFlowers[i][j] == m_flowers:
                garden[i][j] = "*"
    
    # PRINT NEW GARDEN
    s = ""
    for row in garden:
        print(s.join(row))

if __name__ == '__main__':