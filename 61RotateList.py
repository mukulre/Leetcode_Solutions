# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def rotateRight(self, head, k):

        if not head:
            return head

        length = 1
        tail = head 
        while tail.next:
            tail = tail.next
            length +=1

        k = k%length
        if k == 0:
            return head

        new_tail = head
        for i in range(length - k - 1):
            new_tail = new_tail.next

        new_head = new_tail.next
        tail.next = head
        new_tail.next = None

        return new_head   

        