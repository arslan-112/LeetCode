#include <queue>
class RecentCounter {
public:
    RecentCounter() {
        
    }
    std::queue<int> myQueue;
    int count = 0;
    int ping(int t) {
        myQueue.push(t);
        count++;
        if(!myQueue.empty()){
            while(myQueue.front() < t-3000){
                myQueue.pop();
                count--;
            }
        }
        return count;
    }
};

/**
 * Your RecentCounter object will be instantiated and called as such:
 * RecentCounter* obj = new RecentCounter();
 * int param_1 = obj->ping(t);
 */