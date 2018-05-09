package temp;


import java.util.ArrayList;
import java.util.HashMap;

public class PrintAllAnagramTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] words = {"cat", "dog", "tac", "god", "act"};
		
		HashMap<String,ArrayList<Integer>> map = new HashMap<>();
		
		for(int i=0;i<words.length;i++){
			int [] arr= new int[26];
			
			for(int j=0;j<words[i].length();j++){
				char x= words[i].charAt(j);
				arr[x-'a']++;
			}
			String res="";
			for(int j=0;j<26;j++){
				if(arr[j]!=0){
					char ch = (char)('a'+j);
					while(arr[j]!=0){
						res+=ch;
						arr[j]--;
						
						
					}
					
					}
				else
					continue;
				
			}
			if(map.containsKey(res)==true){
				ArrayList<Integer> ab = map.get(res);
				ab.add(i);
				map.put(res, ab);
			}
			
			else{
				ArrayList<Integer> ab= new ArrayList<>();
				ab.add(i);
				map.put(res,ab );
			}
		}
		
		ArrayList<String> mapres = new ArrayList<>(map.keySet());
		for(int i=0;i<mapres.size();i++){
			ArrayList<Integer> resultarraylist = map.get(mapres.get(i));
			if(resultarraylist.size()>1){
				for(int k=0;k<resultarraylist.size();k++){
				System.out.print(words[resultarraylist.get(k)]+" ");
				}
				System.out.println();
			}
			
			
		}

	}

}
