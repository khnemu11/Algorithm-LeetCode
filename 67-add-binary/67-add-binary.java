import java.math.*;

class Solution {
    public String addBinary(String a, String b) {
           BigInteger bigA = new BigInteger(a,2);
			BigInteger bigB = new BigInteger(b,2);
			
	        BigInteger result = bigA.add(bigB);
			
			return result.toString(2);
    }
}