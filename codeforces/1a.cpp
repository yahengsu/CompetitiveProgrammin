#include <bits/stdc++.h>


using namespace std;

int main() {
    long long n, m, a;
    cin >> n >> m >> a;

    if (n <= a && m <= a) {
        cout << 1 << endl;
    } else {
        long long num = n / a;
        if (n % a != 0) 
            num++;
        long long mul = m / a;
        if (mul % a != 0)
            mul++;

        cout << num * mul << endl;
    }

    
}