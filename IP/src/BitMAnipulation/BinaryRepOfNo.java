package BitMAnipulation;

public class BinaryRepOfNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int no = 16;

		int bno = 0;
		int mult = 1;
		while (no > 0) {
			int rem = (no % 2);
			bno += rem * mult;
			mult *= 10;

			no /= 2;

		}
		System.out.println(bno);

	}

}
