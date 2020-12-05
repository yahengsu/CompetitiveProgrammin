#include <bits/stdc++.h>



int main() {
    int t;
    std::cin >> t;

    for (int i = 0; i < t; i++) {
        int n;
        std::cin >> n;

        int a[n];
        for (int i = 0; i < n; i++) {
            int s;
            std::cin >> s;
            a[i] = s;
        }
        int f_l = -1;
        int f_r = -1;
        int h = 0;


        for (int i = 0; i < n; i++) {
            if (f_l == - 1 && a[i] == 1) {
                f_l = i;
                break;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            if (f_r == -1 && a[i] == 1) {
                f_r = i;
                break;
            }
        }

        for (int i = f_l; i <= f_r; i++) {
            if (a[i] == 0) {    
                h += 1;
            }
        }
        std::cout << h << std::endl;

    }
}