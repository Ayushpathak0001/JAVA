public class isPalindrome {
    int val;
    isPalindrome next;
    isPalindrome(){}
isPalindrome(int val) {this.val=val;}
isPalindrome(int val,isPalindrome next){this.val=val; this.next=next;}
  public static void main(String[] args) {

        // Create list: 1 -> 2 -> 3 -> 2 -> 1
        isPalindrome head = new isPalindrome(1);
        head.next = new isPalindrome(2);
        head.next.next = new isPalindrome(3);
        head.next.next.next = new isPalindrome(2);
        head.next.next.next.next = new isPalindrome(1);

        Solution sol = new Solution();

        if (sol.checkPalindrome(head)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    
}
class Solution{
    public isPalindrome reverse(isPalindrome head){
        isPalindrome prev=null;
        isPalindrome curr=head;

        while(curr !=null){
            isPalindrome next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public isPalindrome findMiddle(isPalindrome head){
        isPalindrome hare=head;
        isPalindrome turtle=head;

        while(hare.next != null && hare.next.next != null){
            hare =hare.next.next;
            turtle =turtle.next;
        }
        return turtle;
    }
    public boolean checkPalindrome(isPalindrome head){
        if(head==null || head.next==null){
            return true;
        }
        isPalindrome middle=findMiddle(head);//1st half ka end
        isPalindrome secondHalfStart=reverse(middle.next);

        isPalindrome firstHalfStart=head;
        while(secondHalfStart != null){
            if(firstHalfStart.val != secondHalfStart.val){
                return false;
            }
            firstHalfStart=firstHalfStart.next;
            secondHalfStart=secondHalfStart.next;
        }
        return true;
    }
}
