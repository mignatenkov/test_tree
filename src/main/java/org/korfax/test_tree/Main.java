package org.korfax.test_tree;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
        TreeNode root = createDefalutTree();
        log.debug("result: " + validateBTree(root));
    }

    public static TreeNode createDefalutTree() {
        TreeNode lln = new TreeNode(1, null, null);
        TreeNode lrn = new TreeNode(null, null, null);
        TreeNode ln = new TreeNode(2, lln, lrn);

        TreeNode rln = new TreeNode(5, null, null);
        TreeNode rrn = new TreeNode(7, null, null);
        TreeNode rn = new TreeNode(6, rln, rrn);

        TreeNode root = new TreeNode(4, ln, rn);

        return root;
    }

    public static boolean validateBTree(TreeNode root) {
        log.debug("cur node: " + String.valueOf(root));
        boolean flag = true;
        if (root.getLeft() != null) {
            if (root.compareTo(root.getLeft()) > 0) {
                flag &= validateBTree(root.getLeft());
            } else return false;
        }
        if (root.getRight() != null) {
            if (root.compareTo(root.getRight()) < 0) {
                flag &= validateBTree(root.getRight());
            } else return false;
        }
        return flag;
    }

}