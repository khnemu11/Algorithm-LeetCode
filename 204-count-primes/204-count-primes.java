class Solution {
    public int countPrimes(int n) {
		boolean result[] = new boolean[n];
		int answer = 0;
		
        if(n>1){
            for(int i=2;i<n;i++) {
			    result[i]= true;
            }
                result[0]=false;
                result[1]=false;

            for(int i=2;i*i<=n;i++) {
                for(int j=i*2;j<n;j=j+i) {
                    result[j]=false;
                }
            }
            //System.out.println(Arrays.toString(result));
            for(int i=2;i<n;i++) {
                if(result[i]) {
                    answer++;
                }
            }
        }
        return answer;
    }
}