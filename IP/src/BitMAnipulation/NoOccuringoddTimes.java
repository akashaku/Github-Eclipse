package BitMAnipulation;

public class NoOccuringoddTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int [] arr = {1, 2, 3, 2, 3, 1, 3};
	int res=0;
	
	for(int i=0;i<arr.length;i++){
		res^=arr[i];
		
	}
	System.out.println(res);

	}

}
