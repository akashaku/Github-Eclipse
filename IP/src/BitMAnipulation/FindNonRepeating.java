package BitMAnipulation;

public class FindNonRepeating {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {2, 3, 7, 9, 11, 2, 3, 11};
		
		
		int x=0;
		int y=0;
		int res= 0;
		int lsb =0;
		
		
		
		for(int i=0;i<arr.length;i++){
			res^=arr[i];
		}
		
		lsb=res&(-res);
		for(int i=0;i<arr.length;i++){
			
			if((lsb & arr[i]) ==lsb){
				x^=arr[i];
				
				
			}
			else{
				y^=arr[i];
			}
		}
		System.out.println(x);
		System.out.println(y);
		

	}

}
