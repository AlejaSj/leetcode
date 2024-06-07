class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode aux = l1;
        ListNode aux2 = l2;
        ListNode aux3 = null;
        ListNode aux4 = null;
        int sum = 0;
        int accareo = 0;

        while (aux!=null||aux2!=null||accareo!=0) {
            if (aux!=null) {
                sum += aux.val;
                aux = aux.next;
            }
            if (aux2!=null) {
                sum += aux2.val;
                 aux2 = aux2.next;
            }
            sum+=accareo;
            accareo=0;
            
            if (sum>=10) {
                accareo=sum/10;
                sum=sum%10;
            }

            aux3 = new ListNode(sum,aux3);
            sum = 0;
           
        }
        while (aux3!=null ) {
           aux4 = new ListNode(aux3.val,aux4);
           aux3 = aux3.next;
        }
        return aux4;
    }
}