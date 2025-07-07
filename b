#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    string S;
    getline(cin, S);
    size_t pos = S.find('?');
    if (pos != string::npos) {
        string query = S.substr(pos + 1);
        stringstream ss(query);
        string token;
        while (getline(ss, token, '&')) {
            size_t eq_pos = token.find('=');
            if (eq_pos != string::npos) {
                string param = token.substr(0, eq_pos);
                string value = token.substr(eq_pos + 1);
                cout << param << ": " << value << '\n';
            }
        }
    }
    return 0;
}
