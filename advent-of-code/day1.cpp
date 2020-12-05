#include <bits/stdc++.h>


using namespace std;

int main() {
    ifstream f("day1.txt");
    vector<int> v; 
    unordered_set<int> s;
    int target = 2020;
    int a;
    while(f >> a) {
        v.push_back(a);
    }

    for (int i = 0; i < v.size(); i++) {
        for (int j = i + 1; j < v.size(); j++) {
            for (int k = j + 1; k < v.size(); k++) {
                if ((v[i] + v[j] + v[k]) == target) {
                    cout << v[i] * v[j] * v[k] << endl;
                }
            }
        }
    }
}