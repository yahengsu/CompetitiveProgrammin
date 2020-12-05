#include <bits/stdc++.h>


using namespace std;

int main() {
    int n;
    cin >> n;

    int x_c = 0;
    int y_c = 0;
    int z_c = 0;

    for (int i = 0; i < n; i++) {
        int x, y, z;

        cin >> x >> y >> z;

        x_c += x;
        y_c += y;
        z_c += z;
    }

    if (!x_c && !y_c && !z_c) {
        cout << "YES" << endl;
    } else {
        cout << "NO" << endl;
    }
}