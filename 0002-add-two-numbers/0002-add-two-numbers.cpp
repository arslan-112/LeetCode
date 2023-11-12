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
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* resultHead = NULL;
        ListNode* resultTail = NULL;
        int carry = 0;
        while(l1 || l2 || carry){
            int sum = (l1 ? l1->val : 0) + (l2 ? l2->val : 0) + carry;
            carry = sum / 10;
            ListNode* temp = new ListNode;
            temp->val = sum%10;
            if (resultHead == NULL){
                resultHead = resultTail = temp;
            }else{
                resultTail->next = temp;
                resultTail = temp;
            }
            if (l1) l1 = l1->next;
            if (l2) l2 = l2->next;
        }
        return resultHead;

    }
};