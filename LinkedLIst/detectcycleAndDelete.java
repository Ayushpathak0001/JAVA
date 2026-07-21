
public class detectcycleAndDelete{
    int val;
   detectcycleAndDelete next;
    detectcycleAndDelete(int x){
        val=x;
        next=null;
    }


    public static void main(String[] args) {

        // Create nodes
         detectcycleAndDelete head = new detectcycleAndDelete(1);
        head.next = new detectcycleAndDelete(2);
        head.next.next = new detectcycleAndDelete(3);
        head.next.next.next = new detectcycleAndDelete(4);

        // Create a cycle: 4 -> 2
        head.next.next.next.next = head.next;

        Solution obj = new Solution();

System.out.println("Before removing: " + obj.hasCycle(head));

obj.removeCycle(head);

System.out.println("After removing: " + obj.hasCycle(head));
    }

}
 class Solution{
    public boolean hasCycle(detectcycleAndDelete head){
        if(head == null){
            return false;
        }
       detectcycleAndDelete hare=head;//fast
        detectcycleAndDelete turtle =head;//slow
        
        while(hare != null && hare.next!= null){
            hare=hare.next.next;
            turtle=turtle.next;

            if(hare == turtle){
                return true;
            }
        }
        return false;   
    }
    public void removeCycle(detectcycleAndDelete head) {

   detectcycleAndDelete slow = head;
   detectcycleAndDelete fast = head;
    boolean cycle = false;

    // Detect cycle
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;

        if (slow == fast) {
            cycle = true;
            break;
        }
    }

    if (!cycle) {
        return;
    }

    // Find start of cycle
    slow = head;
    detectcycleAndDelete prev = null;

    while (slow != fast) {
        prev = fast;
        slow = slow.next;
        fast = fast.next;
    }

    // If cycle starts at head
    if (prev == null) {
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null;
    } else {
        prev.next = null;
    }
}

}


