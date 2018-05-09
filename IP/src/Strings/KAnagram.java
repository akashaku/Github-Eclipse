package temp;

public class KAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String  str1 = "anagram";
		String str2 = "grammar" ;
		int k = 3;
		
		int [] arr= new int [26];
		for(int i=0;i<str1.length();i++){
			char x= str1.charAt(i);
			arr[x-'a']++;
		}
		for(int i=0;i<str2.length();i++){
			char x= str2.charAt(i);
			
				arr[x-'a']--;
			
			
		}
		int noc=0;
		for(int i=0;i<26;i++){
			if(arr[i]>0){
				noc+=arr[i];
				
				
			}
			
		}
		if(noc<=k){
			System.out.println("Yes");
		}
		else{
			System.out.println("NO");
		}

	}

}
