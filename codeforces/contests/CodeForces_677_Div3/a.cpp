#include <bits/stdc++.h>



int main() {

    std::unordered_map<int, int> m;

    int curr = 0;

    for (int i = 1; i < 10; i++) {
        int a = i;
        for (int j = 1; j < 5; j++) {
            
            m[a] = curr + j;

            a = (a*10) + i;
            curr += j;

        }
    }

    int t;

    std::cin >> t;

    for (int i = 0; i < t; i++) {
        int s;
        std::cin >> s;

        std::cout << m[s] << std::endl;
    }

    return 0;
}