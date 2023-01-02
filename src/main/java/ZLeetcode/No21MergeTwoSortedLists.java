package ZLeetcode;

public class No21MergeTwoSortedLists {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1 = list1;
        ListNode p2 = list2;
        ListNode p = new ListNode(0, null);
        while(p1 != null && p2 != null) {
            if(p1.val <= p2.val) {
                p.next = p1;
                p1 = p1.next;
            } else {
                p.next = p2;
                p2 = p2.next;
            }
        }
        return p.next;
    }

    public static void test() {
        No21MergeTwoSortedLists c = new No21MergeTwoSortedLists();
    }
}
