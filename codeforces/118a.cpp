#include <bits/stdc++.h>


using namespace std;

int main() {
    string s;

    cin >> s;
    string n = "";
    unordered_set<char> vowels ({'a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'});
    for (auto c :s) {
        if (vowels.count(c) != 0) {
            continue;
        }
        else if (vowels.count(c) == 0) {
            n += ".";
            if (isupper(c)) {
                n += (char) (c + 32);
            } else {
                n += c;
            }
        }
    }

    cout << n << endl;
}