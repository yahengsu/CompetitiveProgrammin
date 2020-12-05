#include <bits/stdc++.h>


using namespace std;

int main() {
    int n, k;
    cin >> n >> k;
    int ans = 0;
    int score = 0;
    for (int i = 0; i < n; i++) {
        int s;
        cin >> s;
        if (s <= 0)
            continue;
        if (i < k - 1) {
            ans++;
        } 
        else if (i == k - 1) {
            score = s;
            ans++;
        } else {
            if (s >= score) {
                ans++;
            }
        }
    }

    cout << ans << endl;
}