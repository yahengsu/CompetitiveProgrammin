#include <bits/stdc++.h>


using namespace std;

vector<int> readVector(int n) {
    vector<int> a;

    for (int i = 0; i < n; i++) {
        int e;
        cin >> e;
        a.push_back(e);
    }

    return a;
}


int main() {
    int n;

    cin >> n;

    for (int i = 0; i < n; i++) {
        int m = 0;

        int s;
        cin >> s;
        vector<int> a = readVector(s);

        for (int j = 0; j < s; j++) {
            m = max(m, a[j]);
        }

        int idx = -1;
        for (int j = 0; j < s; j++) {
            if (a[j] != m) {
                continue;
            }
            if (j > 0 && a[j - 1] != m) {
                idx = j + 1;
            }
            if (j < s - 1 && a[j + 1] != m) {
                idx = j + 1;
            }
        }
    
        cout << idx << endl;
    }
}