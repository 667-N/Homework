package LinkedList;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Solution sol = new Solution();
       //1
        ListNode list1_1 = Solution.createList(new int[]{1,2,4});
        ListNode list2_1 = Solution.createList(new int[]{1,3,4});
        ListNode merged_1 = sol.mergeTwoLists(list1_1, list2_1);
        System.out.println("example 1");
        sol.printList(merged_1);
       //2
        ListNode list1_2 = Solution.createList(new int[]{});
        ListNode list2_2 = Solution.createList(new int[]{});
        ListNode merged_2 = sol.mergeTwoLists(list1_2, list2_2);
        System.out.println("example 2");
        sol.printList(merged_2);
        //3
        ListNode list1_3 = Solution.createList(new int[]{});
        ListNode list2_3 = Solution.createList(new int[]{0});
        ListNode merged_3 = sol.mergeTwoLists(list1_3, list2_3);
        System.out.println("example 3");
        sol.printList(merged_3);
     }
}
