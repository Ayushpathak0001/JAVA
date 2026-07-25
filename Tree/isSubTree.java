public class isSubTree {
    int val;
    isSubTree left;
    isSubTree right;
    isSubTree(){}
    isSubTree(int val){this.val=val;}
    isSubTree(int val,isSubTree left,isSubTree right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
     public static void main(String[] args) {

        // Main Tree
        //        3
        //      /   \
        //     4     5
        //    / \
        //   1   2

        isSubTree root = new isSubTree(3);
        root.left = new isSubTree(4);
        root.right = new isSubTree(5);
        root.left.left = new isSubTree(1);
        root.left.right = new isSubTree(2);

        // Sub Tree
        //      4
        //     / \
        //    1   2

        isSubTree subRoot = new isSubTree(4);
        subRoot.left = new isSubTree(1);
        subRoot.right = new isSubTree(2);

        Solution sol = new Solution();

        System.out.println("Is Subtree: " + sol.issubTree(root, subRoot));
    }
}

class Solution{
    public boolean isIdentical(isSubTree root,isSubTree subRoot){
        if(root==null && subRoot==null){
            return true;
        }
        if(root == null || subRoot == null){
            return  false;
        }
        if(root.val==subRoot.val){
            return isIdentical(root.left,subRoot.left)&& isIdentical(root.right,subRoot.right);
            
        }
        return false;

    }
    public boolean issubTree(isSubTree root,isSubTree subRoot){
        if(subRoot == null){
            return true;
        }
        if(root==null){
            return false;
        }
        if(root.val==subRoot.val){
            if(isIdentical(root,subRoot)){
                return true;
            }
        }
        return issubTree(root.left,subRoot)|| issubTree(root.right,subRoot.right);
    }
}
