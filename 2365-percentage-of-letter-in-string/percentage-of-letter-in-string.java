class Solution {
    public int percentageLetter(String s, char letter) {
        double temp=0;
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)==letter){
	            temp++;
	        }
	    }
        return (int)((temp /s.length())*100.0);
    }
}