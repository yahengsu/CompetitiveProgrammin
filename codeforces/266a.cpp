#include <bits/stdc++.h>


using namespace std;

int main() {
    int n;
    string s;

    cin >> n >> s;

    char prev = s[0];

    int count = 0;

    for (int i = 1; i < s.size(); i++) {
        if (s[i] == prev) {
            count++;
        }
        prev = s[i];

    }

    cout << count << endl;

}