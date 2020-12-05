#include <bits/stdc++.h>


using namespace std;

int main() {

    int n;

    cin >> n;
    int ans = 0;
    for (int i = 0; i < n; i++) {
        int a,b,c;
        int s = 0;
        cin >> a >> b >> c;

        if (a == 1)
            s++;
        if (b == 1)
            s++;
        if (c == 1)
            s++;

        if (s >= 2)
            ans++;
    }

    cout << ans << endl;
}