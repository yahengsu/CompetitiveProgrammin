from collections import Counter

if __name__ == "__main__":

    # PART 1
    num_total = 1
    grid = []
    with open("day3.txt") as f:
        lines = f.readlines()
        for line in lines:
            a = list(line[:len(line) - 1])
            grid.append(a)


    deltas_x = [1,3,5,7,1]
    deltas_y = [1,1,1,1,2]
    for dx, dy in zip(deltas_x, deltas_y):
        num_trees = 0
        y = dy 
        x = dx 
        while y < len(grid):
            if grid[y][x] == "#":
                num_trees += 1
            
            y += dy
            x = (x + dx) % len(grid[0])
        
        num_total *= num_trees
    print(num_total)