#include <bits/stdc++.h>


using namespace std;

int main() {
    string m, n;

    cin >> n >> m;
    int a = 0;
    for (int i = 0; i < n.size(); i++) {
        if (tolower(n[i]) > tolower(m[i])) {
            a = 1;
            break;
        } 
        else if (tolower(n[i]) < tolower(m[i])) {
            a = -1;
            break;
        }
    }

    cout << a << endl;
}