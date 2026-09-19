#include <vector>
#include <numeric>
#include <algorithm>

class Solution {
public:
    double findMaxAverage(std::vector<int>& arr, int k) {
        std::vector<double> list;
        int sum = 0;
        
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        list.push_back(static_cast<double>(sum) / k);
        
        for (int i = k; i < arr.size(); i++) {
            sum += arr[i] - arr[i - k];
            list.push_back(static_cast<double>(sum) / k);
        }
        
        return *std::max_element(list.begin(), list.end());
    }
};