package Trees;

import java.util.Scanner;

public class ConstructTreefromPreOrder {

	private static class Node {
		int data;
		Node left;
		Node right;

		Node(int data, Node left, Node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}
	}

	public static void display(Node node) {
		if (node == null) {
			return;
		}

		String str = "";

		str += node.left == null ? "." : node.left.data;
		str += " => " + node.data + " <= ";
		str += node.right == null ? "." : node.right.data;

		System.out.println(str);

		display(node.left);
		display(node.right);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] data = new int[soa];
		char[] info = new char[soa];

		for (int i = 0; i < soa; i++) {
			data[i] = sc.nextInt();
		}
		for (int i = 0; i < soa; i++) {
			info[i] = sc.next().charAt(0);
		}

		Node[] tree = new Node[soa];
		for (int i = 0; i < soa; i++) {
			tree[i] = new Node(data[i], null, null);
		}

		solve(data, info, tree, 0);
		display(tree[0]);

	}

	static int i = 0;

	public static void solve(int[] data, char[] info, Node[] tree, int j) {
		if (tree == null)
			return;
		if (info[j] == 'L')
			return;

		if (info[i] == 'N' && tree[j].left == null) {
			tree[j].left = tree[i + 1];
			i++;
			solve(data, info, tree, j + 1);
		}

		if (tree[j].left == null) {
			tree[j].left = tree[i + 1];
			i++;
		} else if (tree[j].right == null) {
			tree[j].right = tree[i + 1];
			i++;
			solve(data, info, tree, j + 1);

		} else {

		}
	}

}
