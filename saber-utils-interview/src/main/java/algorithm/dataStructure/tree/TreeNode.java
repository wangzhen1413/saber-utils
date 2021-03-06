package algorithm.dataStructure.tree;

/**
 * 插入：https://blog.csdn.net/qq_29897369/article/details/81953208
 *
 * @author Aria
 * @time on 2018/12/23.
 */
public class TreeNode {
    public String value;
    public TreeNode left;
    public TreeNode right;
    public int val;

    public TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(String value) {
        this.value = value;
    }


    public TreeNode(String value, TreeNode left, TreeNode right)//节点的构造函数，测试函数中创建节点就是用了它
    {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
