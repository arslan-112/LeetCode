/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    void reorderList(ListNode* head) {
        if(!head->next || !head->next->next)
            return;
        else{
            ListNode* start = head;
            ListNode* end = head;
            ListNode* prev = NULL;
            while(start && start->next){
                while(end->next){
                    prev = end;
                    end = end->next;
                }
                prev->next = NULL;
                end->next = start ->next;
                start->next = end;
                start = end->next;
                end = head;
                }
        }
    }
 
};