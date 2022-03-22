package algos.trees;

public class BinaryExpressionEvaluvator {

	public static void main(String[] args) {
		Node root = new Node("+");
		root.left = new Node("*");
		root.right = new Node("/");
		root.left.left = new Node("-");
		root.left.right = new Node("5");
		root.right.left = new Node("21");
		root.right.right = new Node("7");
		root.left.left.left = new Node("10");
		root.left.left.right = new Node("5");

		System.out.println("The value of the expression tree is " + evaluate(root));
	}

	private static double evaluate(Node root) {
		if (root.left == null && root.right == null) {
			return Double.valueOf(root.val);
		}

		double lValue = 0;
		double rValue = 0;
		if (root.left != null) {
			lValue = evaluate(root.left);
		}
		if (root.right != null) {
			rValue = evaluate(root.right);
		}

		return process(root.val, lValue, rValue);
	}

	public static double process(String op, double x, double y) {
		if (op.equals("+")) {
			return x + y;
		}
		if (op.equals("-")) {
			return x - y;
		}
		if (op.equals("*")) {
			return x * y;
		}
		if (op.equals("/")) {
			return x / y;
		}

		return 0;
	}

}

class Node {
	String val;
	Node left, right;

	Node(String val) {
		this.val = val;
		this.left = this.right = null;
	}
}