package temp;


import java.util.ArrayList;
import java.util.HashMap;


public class GroupWordsWithSameSetOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] arr = { "may", "student", "students", "dog",
                "studentssess", "god", "cat", "act", "tab",
                "bat", "flow", "wolf", "lambs", "amy", "yam",
                "balms", "looped", "poodle"};
		
	
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++){
			boolean [] farray=new boolean [26];
			String temp =arr[i];
			for(int j=0;j<temp.length();j++){
				char ch=temp.charAt(j);
				farray[ch-'a']=true;;
				
				
			}
			String res="";
			for(int j=0;j<26;j++){
				if(farray[j]==true){
					res+=('a'+j);
					
				}
				
			}
			if(map.containsKey(res)==true){
				ArrayList<Integer> ab = map.get(res);
				ab.add(i);
				map.put(res, ab);
			}
			else{
				ArrayList<Integer> ab = new ArrayList<>();
				ab.add(i);
				map.put(res, ab);
			}
			
		}
		ArrayList<String> trav = new ArrayList<>(map.keySet());
		for(int i=0;i<trav.size();i++){
			ArrayList<Integer> resultarraylist = map.get(trav.get(i));
			if(resultarraylist.size()>1){
				for(int k=0;k<resultarraylist.size();k++){
				System.out.print(arr[resultarraylist.get(k)]+" ");
				}
				System.out.println();
			}
			
			
		}

	}

}
