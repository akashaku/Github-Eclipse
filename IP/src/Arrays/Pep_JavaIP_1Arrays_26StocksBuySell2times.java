package Arrays;

import java.util.Scanner;

public class Pep_JavaIP_1Arrays_26StocksBuySell2times {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int soa = sc.nextInt();
		int[] arr = new int[soa];

		for (int i = 0; i < soa; i++) {
			arr[i] = sc.nextInt();
		}
		
		int buy=0;
		int sell=0;
		int p1=0;
		int p2=0;
		int temp=0;
		int min=arr[0];
		
		while(sell<arr.length){
			temp=arr[sell]-arr[buy];
			if(arr[sell]<min){
				min=arr[sell];
				buy=sell;
				p2=p1;
				p1=temp;
			}
			else{
				sell++;
			}
			
			
			
			
		}
	int z= arr[sell-1]-arr[buy];
	if(z>p1){
		p2=p1;
		p1=z;
	}
	System.out.println(z);

	}

}
