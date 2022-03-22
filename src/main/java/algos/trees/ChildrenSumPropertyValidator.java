package algos.trees;

public class ChildrenSumPropertyValidator {

	static int addNumbers(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Tree root = new Tree(25);
		root.left = new Tree(12);
		root.right = new Tree(13);
		root.left.left = new Tree(7);
		root.left.right = new Tree(5);
		root.right.left = new Tree(6);
		root.right.right = new Tree(7);
		int height = isChildrenSumPropertyTrue(root);
		System.out.println(height);
	}

	static int isChildrenSumPropertyTrue(Tree root) {
		if (root.left == null && root.right == null) {
			return root.data;
		}
		int lSum = 0;
		int rSum = 0;
		if (null != root.left) {
			lSum = isChildrenSumPropertyTrue(root.left);
		}
		if (null != root.right) {
			rSum = isChildrenSumPropertyTrue(root.right);
		}
		if (lSum != Integer.MIN_VALUE && rSum != Integer.MIN_VALUE && lSum + rSum == root.data) {
			return root.data;
		}
		return Integer.MIN_VALUE;

	}

	static class Tree {
		public Tree(int data) {
			super();
			this.data = data;
		}

		int data;
		Tree left;
		Tree right;
	}

}
