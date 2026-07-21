public class detectIsCycle {
    int val;
    detectIsCycle next;
    detectIsCycle(int x){
        val=x;
        next=null;
    }


    public static void main(String[] args) {

        // Create nodes
        detectIsCycle head = new detectIsCycle(1);
        head.next = new detectIsCycle(2);
        head.next.next = new detectIsCycle(3);
        head.next.next.next = new detectIsCycle(4);

        // Create a cycle: 4 -> 2
        head.next.next.next.next = head.next;

        Solution obj = new Solution();

        if (obj.hasCycle(head)) {
            System.out.println("Cycle Detected");
        } else {
            System.out.println("No Cycle");
        }
    }

}
 class Solution{
    public boolean hasCycle(detectIsCycle head){
        if(head == null){
            return false;
        }
        detectIsCycle hare=head;//fast
        detectIsCycle turtle =head;//slow
        
        while(hare != null && hare.next!= null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;
    }
}
