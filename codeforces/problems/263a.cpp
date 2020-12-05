#include <bits/stdc++.h>


using namespace std;

int main() {
    int s;
    int dist = 0;
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            cin >> s;

            if (s == 1) {
                dist = abs(i - 2) + abs(j - 2);
            }
        }
    }

    cout << dist << endl;
}