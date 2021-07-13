 boolean checkBST(Node root) {
        return helper(root, null, null);
    }

    boolean helper(Node root, Integer min, Integer max){
        if (root == null)
            return true;
        if(min != null && root.data <= min)
            return false;
        if(max != null && root.data >= max)
            return false;
        return helper(root.left, min, root.data) && helper(root.right, root.data, max);
    }
