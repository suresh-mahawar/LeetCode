package leetcode;

public class ReOrderList {
    public void reorderList(ListNode head) {
        if(head == null||head.next == null || head.next.next == null){
        }
        else{
            ListNode headHalf;
            headHalf = getHalfList(head);
            headHalf = reverse(headHalf);
            head = merge(head,headHalf);
        }
    }
    public ListNode  getHalfList(ListNode head){
        ListNode PtrFirst = head;
        ListNode PtrSecond = head;
        ListNode ToBeNull=head;
        while(PtrSecond.next != null && PtrSecond.next.next != null){
        	ToBeNull = PtrFirst;
            PtrFirst = PtrFirst.next;
            PtrSecond = PtrSecond.next.next;
        }
        if(PtrSecond.next == null){
        	ToBeNull.next = null;
            return PtrFirst;
        }
        if(PtrSecond.next.next == null){
        	return PtrFirst.next;
        }
        return PtrFirst;


    }
    public ListNode  reverse(ListNode head){
        if(head == null) return null;
        ListNode  PtrHolder = head.next;
        ListNode  Ptr = head.next;
        head.next = null;
        while(PtrHolder != null){
            PtrHolder = Ptr.next;
            Ptr.next = head;
            head = Ptr;
            Ptr = PtrHolder;
            if(Ptr==null)break;
            PtrHolder = PtrHolder.next;
        }
        if(Ptr==null) return head;
        Ptr.next = head;
        head = Ptr;
        return head;
    }
    public ListNode merge(ListNode first, ListNode second){
        ListNode  PtrFirst = first.next;
        ListNode  PtrSecond = second.next;
        ListNode  head = first;
        head.next=second;
        head = head.next;
        while(PtrFirst!=null && PtrSecond!=null){
            head.next = PtrFirst;
            head = head.next;
            PtrFirst = PtrFirst.next;
            head.next = PtrSecond;
            head = head.next;
            PtrSecond = PtrSecond.next;
        }
        if(PtrSecond!=null) head.next = PtrSecond;
        return first;
    }   
}