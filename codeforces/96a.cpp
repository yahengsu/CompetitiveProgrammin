#include <bits/stdc++.h>


using namespace std;

int main() {
    string s;

    cin >> s;
    char prev = s[0];
    int count = 0;
    for (auto c : s) {
        if (c == prev) {
            count++;
        } else {
            count = 1;
            prev = c;
        }

        if (count == 7) {
            cout << "YES" << endl;
            break;
        }
    }

    if (count < 7) {
        cout << "NO" << endl;
    }
}