package Trees;

import java.util.Scanner;

public class MakeTreeFromArray {

	public static class node {
		int data;
		node left;
		node right;

		node(int data, node left, node right) {
			this.data = data;
			this.left = left;
			this.right = right;
		}

	}

	public static void main(String[] args) {
		node root = null;
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];
		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}

		node[] tree = new node[soa];
		for (int i = 0; i < tree.length; i++) {
			tree[i] = new node(i, null, null);

		}

		for (int i = 0; i < soa; i++) {
			if (arr[i] == -1) {
				root = tree[i];

			} else {

				if (tree[arr[i]].left == null) {
					tree[arr[i]].left = tree[i];
				} else if (tree[arr[i]].right == null) {
					tree[arr[i]].right = tree[i];

				} else {
					System.out.println("INVALID");
					return;
				}

			}
		}
		display(root);

	}
	public static void display(node root){
		
		if(root== null)
			return;
		String str = "";

		str += root.left == null ? "." : root.left.data;
		str += " => " + root.data + " <= ";
		str += root.right == null ? "." : root.right.data;

		System.out.println(str);

		display(root.left);
		display(root.right);
		
	}

}
