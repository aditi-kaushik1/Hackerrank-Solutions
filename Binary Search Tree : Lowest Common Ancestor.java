public static Node lca(Node root, int v1, int v2) {
        Node curr = root;
        
        while(curr != null) {
            if(v1 > curr.data && v2 > curr.data)
                curr = curr.right;
            else if(v2 < curr.data && v1 < curr.data)
                curr = curr.left;
            else
                return curr;
        }
        return null;
}
