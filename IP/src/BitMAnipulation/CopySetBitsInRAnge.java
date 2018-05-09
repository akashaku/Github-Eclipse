package BitMAnipulation;

public class CopySetBitsInRAnge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10, y = 13, l = 2, r = 3;

		// finding those set bits in y

		int temp = 1;
		temp = temp << (r - l + 1);

		temp--;

		temp = temp << (l-1);

		temp = temp & y;

		x = x | temp;

		System.out.println(x);

	}

}
