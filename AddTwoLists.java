public class AddTwoLists {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode addTwoLists(ListNode l1,ListNode l2){
        ListNode node= new ListNode();
        ListNode temp=node;
        int carry=0;
        while (l1!=null || l2!=null|| carry!=0){
            int sum=0;
            if(l1!=null){
                sum=sum+l1.val;
                l1=l1.next;

            }
            if(l2!=null){
                sum=sum+l2.val;
                l2=l2.next;
            }
            sum+=carry;
            carry=sum/10;
            ListNode newNode= new ListNode(sum%10);
            temp.next=newNode;
            temp=temp.next;
        }
        return node.next;

    }
}
