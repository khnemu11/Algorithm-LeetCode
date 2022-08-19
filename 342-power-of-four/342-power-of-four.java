class Solution {
    public boolean isPowerOfFour(int n) {
       if(n<0)  return false;
		//System.out.println(Long.toBinaryString((long)n));
		String binary = Long.toBinaryString((long)n);
		//System.out.println(binary.replace("1", "").length() %2 == 0);
		if(binary.charAt(0)=='1' 
				&& binary.length()-binary.replace("1", "").length()==1
				 &&  binary.replace("1", "").length() %2 == 0) {
			return true;
		}
		else {
			return false;
		}
    }
}