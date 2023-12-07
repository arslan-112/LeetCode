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
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode* traverser = head;
        ListNode* delayed = head;
        for(int i=0;i<n;i++)
            traverser = traverser->next;
        if(!traverser)
            return head->next;
        while(traverser->next){
            traverser = traverser->next;
            delayed= delayed->next;
        }
        delayed->next = delayed->next->next;
        return head;
    }
};