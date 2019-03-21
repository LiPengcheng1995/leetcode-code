package solution203;

import java.util.List;

/**
 *  指针移动问题修改
 *
 * 速度击败 98.40%
 * 运存击败 88.69%
 * @author lipengcheng3 Created date 2019-03-21 13:56
 */
public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode now = head,pre = null;
        while (now != null){
            if (now.val == val){
                if (pre == null){
                    now = now.next;
                    head = now;
                    continue;
                }else {
                    now = now.next;
                    pre.next = now;
                    continue;
                }
            }
            pre = now;
            now = now.next;
        }
        return head;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode temp = head;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(2);
        temp = temp.next;
        temp.next = new ListNode(1);
        temp = temp.next;
        new Solution203().removeElements(head,2);
    }

}
