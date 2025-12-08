package LinkedList;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static ListNode createList(int[] values){
        ListNode head = null;
        ListNode tail = null;
        for(int val : values){
            ListNode node = new ListNode(val);
            if(head == null){
                head = node;
                tail = node;
            }
            else{
                tail.next = node;
                tail = node;
            }
        }
        return head;
    }

    ListNode mergeTwoLists(ListNode list1, ListNode list2){
        ListNode emptynode = new ListNode(0);
        ListNode tail = emptynode;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            }
            else{
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        tail.next = list1 != null ? list1 : list2;
        return emptynode.next;
    }
   /* ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode tmp1=list1;
        ListNode tmp2=list2;
        ListNode resulthead;
        ListNode tmpresult=null;
        if (list1==null)
            return list2;
        if (list2==null)
            return list1;

        if (tmp1.val<tmp2.val){
            resulthead=tmp1;
            tmpresult=tmp1;
            tmp1=tmp1.next;
        }
        else{
            resulthead=tmp2;
            tmpresult=tmp2;
            tmp2=tmp2.next;
        }
        while((tmp1!=null) && (tmp2!=null)){
            while((tmp1!=null) && (tmp2!=null) && (tmp1.val<=tmp2.val)){
                tmpresult.next=tmp1;
                tmp1=tmp1.next;
                tmpresult=tmpresult.next;
            }
            while((tmp2!=null) && (tmp1!=null) && (tmp1.val>=tmp2.val)){
                tmpresult.next=tmp2;
                tmp2=tmp2.next;
                tmpresult=tmpresult.next;
            }
        }
        while((tmp2!=null) && (tmp1==null)){
            tmpresult.next=tmp2;
            tmp2=tmp2.next;
            tmpresult=tmpresult.next;
        }
        while((tmp1!=null) && (tmp2==null)){
            tmpresult.next=tmp1;
            tmp1=tmp1.next;
            tmpresult=tmpresult.next;
        }
        return resulthead;
    }*/

    void printList(ListNode list){
        if(list == null) return;

        ListNode tmp = list;

        while(tmp!=null){
            System.out.print(tmp.val+" ");
            tmp=tmp.next;
        }
        System.out.println();
    }
};