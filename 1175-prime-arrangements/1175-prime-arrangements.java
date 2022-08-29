class Solution {
    public int numPrimeArrangements(int n) {
    	boolean[]arr = new boolean[n+1];
		
		arr[0]=true;
		arr[1]=true;
		int primeCount=0;
		
		for(int i=2;i<=n;i++) {
			if(arr[i]==false) {
				for(int j=i*2;j<=n;j=j+i) {
					arr[j]=true;
				}
				primeCount++;
			}
		}
		long result=1;
		
		for(int i=2;i<=primeCount;i++) {
			result=result*i;
			result=result%1000000007;
		}
		for(int i=2;i<=n-primeCount;i++) {
			result=result*i;
			result=result%1000000007;
		}
    	
		return (int)result;
        
    }
}