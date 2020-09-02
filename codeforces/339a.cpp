#include <bits/stdc++.h>


using namespace std;

int main() {
    string s;

    cin >> s;
    vector<string> nums;
    stringstream line(s);
    string buf;

    while (getline(line, buf, '+')) {
        nums.push_back(buf);
    }
    sort(nums.begin(), nums.end());
    string ans = "";

    for (int i = 0; i < nums.size(); i++) {
        ans += nums[i];
        if (i != nums.size() - 1) {
            ans += '+';
        }
    }

    cout << ans << endl;
}