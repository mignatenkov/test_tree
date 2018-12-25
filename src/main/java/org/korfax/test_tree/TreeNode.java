package org.korfax.test_tree;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TreeNode implements Comparable<TreeNode> {

    private Integer value;
    private TreeNode left;
    private TreeNode right;

    public String toString() {
        StringBuilder sb = new StringBuilder("val: ");
        sb.append(String.valueOf(this.getValue())).append(" (l: ");
        sb.append(this.getLeft() != null ? String.valueOf(this.getLeft().getValue()) : "null");
        sb.append(", r: ");
        sb.append(this.getRight() != null ? String.valueOf(this.getRight().getValue()) : "null");
        sb.append(")");
        return sb.toString();
    }

    @Override
    public int compareTo(TreeNode o) {
        if (o.getValue() == null) return 1;
        if (this.getValue() == null) return -1;
        if (o.getValue() < this.getValue()) return 1;
        if (o.getValue() > this.getValue()) return -1;
        return 0;
    }
}