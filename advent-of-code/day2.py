from collections import Counter

if __name__ == "__main__":

    # PART 1
    num_valid = 0
    with open("day2.txt") as f:
        lines = f.readlines()

        for line in lines:
            tokens = line.split(" ")
            nums = tokens[0].split("-")
            min_c =  int(nums[0])
            max_c = int(nums[1])
            ch = tokens[1][0]
            # c = Counter(tokens[2])
            # if min_c <= c[ch] <= max_c:
            #     num_valid += 1
            if tokens[2][min_c-1] == ch and tokens[2][max_c-1] != ch:
                num_valid += 1
            elif tokens[2][min_c-1] != ch and tokens[2][max_c-1] == ch:
                num_valid += 1

    print(num_valid)