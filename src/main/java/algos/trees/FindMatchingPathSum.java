package algos.trees;

public class FindMatchingPathSum {

	static int addNumbers(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.data = 10;
		tree.left = new Tree();
		tree.left.data = 7;
		tree.left.left = new Tree();
		tree.left.left.data = 8;
		tree.left.right = new Tree();
		tree.left.right.data = 3;
		tree.left.right.left = new Tree();
		tree.left.right.left.data = 2;
		
		tree.right = new Tree();
		tree.right.data = 12;
		tree.right.left = new Tree();
		tree.right.left.data = 10;
		tree.right.right = new Tree();
		tree.right. right.data = 16;
		tree.right.right.left = new Tree();
		tree.right.right.left.data = 15;
		tree.right.right.right = new Tree();
		tree.right.right.right.data = 20;
		tree.right.right.right.right = new Tree();
		tree.right.right.right.right.data = 30;
		int height = findHeight(tree);
		System.out.println(height);
	}

	static int findHeight(Tree root) {
		if (root.left == null && root.right == null) {
			return 0;
		}
		int lHeight = 0; 
		int rHeight = 0;
		if (null != root.left) {
			lHeight = findHeight(root.left);
		}
		if (null != root.right) {
			rHeight = findHeight(root.right);
		}
		int height = (lHeight > rHeight ? lHeight + 1 : rHeight + 1);
		return height;

	}

	static class Tree {
		int data;
		Tree left;
		Tree right;
	}

}
