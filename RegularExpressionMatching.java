package leetcode;

public class RegularExpressionMatching {
	public boolean isMatch(String s, String p){
		int i = 0, j = 0;
		while(i < p.length() && j < s.length()){
			if(p.charAt(i) == '.'){
			i++;
			j++;	
			}else if (p.charAt(i) == '*'){
				if(i==0) return false;
				while( j < s.length() && (p.charAt(i-1) == s.charAt(j) || p.charAt(i-1) == '.')){
					j++;
				}
				if(j < s.length() && (p.charAt(i-1) != s.charAt(j) || p.charAt(i-1) != '.')) return false;
				
			}else if(p.charAt(i) == s.charAt(j)){
				i++;
				j++;
			}			
			else{	
				if(i+1>=p.length() || p.charAt(i+1)!= '*' ) return false;
				if(!isMatch(s.substring(j,j),p.substring(i, i+1)))
				return false;
				j++;
			}
		}
		if(j < s.length()) return false;
		if(i < p.length()-1) return false;
		return true;
	}
}
