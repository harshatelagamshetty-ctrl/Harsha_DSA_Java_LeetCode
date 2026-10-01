#include <string>
#include <stack>
#include <unordered_set>

class Solution {
public:
    bool isValid(std::string s) {
        const std::unordered_set<char> openSet = {'(', '{', '['};
        const std::unordered_set<char> closeSet = {')', '}', ']'};

        std::stack<char> st;

        for (char ch : s) {
            if (openSet.count(ch)) {
                st.push(ch);
            } else if (closeSet.count(ch)) {
                if (st.empty() || !sameType(ch, st.top())) {
                    return false;
                }
                st.pop();
            }
        }

        return st.empty();
    }

    bool sameType(char c1, char c2) {
        if (c1 == ')' && c2 == '(') return true;
        if (c1 == ']' && c2 == '[') return true;
        if (c1 == '}' && c2 == '{') return true;
        return false;
    }
};
