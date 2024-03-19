class Solution{

	public boolean anagram(String a, String t){
		
		String a; 
		String b;

		if(a = null || b = null){
			return false;
		} 

		if(a.length() != b.length()) {
			return false;
		}

		char[] aChar = a.toCharArray();
		char[] bChar = b.toCharArray();

		Arrays.sort(aChar);
		Arrays.sort(bChar);

		return Arrays.equals(aChar, bChar);
	}

}