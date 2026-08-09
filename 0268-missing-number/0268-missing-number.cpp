class Solution {
public:
    class Pair {
    public:
        int val;
        int idx;

        Pair(int val, int idx) {
            this->val = val;
            this->idx = idx;
        }
    };

    int missingNumber(vector<int>& v) {
        sort(v.begin(), v.end());

        vector<Pair> list;

        for (int i = 0; i < v.size(); i++) {
            list.emplace_back(v[i], i);
        }

        for (int i = 0; i < list.size(); i++) {
            if (list[i].val != list[i].idx)
                return list[i].idx;
        }

        return v.size();
    }
};