package Trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class VerticalTraversal {

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
		Node root = null;

		Scanner scn = new Scanner(System.in);
		int[] arr = new int[scn.nextInt()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scn.nextInt();
		}

		Node[] nodes = new Node[arr.length];
		for (int i = 0; i < nodes.length; i++) {
			if (arr[i] != -1) {
				nodes[i] = new Node(arr[i], null, null);

				if (i > 0) {
					int pi = (i - 1) / 2;

					if (i == 2 * pi + 1) {
						nodes[pi].left = nodes[i];
					} else {
						nodes[pi].right = nodes[i];
					}
				}
			}
		}

		// display(nodes[0]);
		HashMap<Integer, ArrayList<Integer>> res = new HashMap<>();
		solve(nodes[0], res, 0);
		ArrayList<Integer> reslist = new ArrayList<>(res.keySet());
		Collections.sort(reslist);

		for (int i = 0; i < reslist.size(); i++) {
			ArrayList<Integer> ab = res.get(reslist.get(i));
			for (int j = 0; j < ab.size(); j++) {
				System.out.print(ab.get(j) + " ");
			}
			System.out.println();
		}
	}

	private static void solve(Node node, HashMap<Integer, ArrayList<Integer>> map, int c) {

		if (node == null)
			return;

		if (map.containsKey(c)) {
			ArrayList<Integer> ab = map.get(c);
			ab.add(node.data);
			map.put(c, ab);
		} else {
			ArrayList<Integer> ab = new ArrayList<>();
			ab.add(node.data);
			map.put(c, ab);

		}

		solve(node.left, map, c - 1);

		solve(node.right, map, c + 1);

	}

}
