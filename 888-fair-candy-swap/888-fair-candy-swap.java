class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
		int answer[] = new int [2];
		
		int aliceSum = Arrays.stream(aliceSizes).sum();
		int bobSum= Arrays.stream(bobSizes).sum();
    	int differ = (aliceSum-bobSum)/2;
		for(int i=0;i<aliceSizes.length;i++) {
			for(int j=0;j<bobSizes.length;j++) {
				if(aliceSizes[i]-bobSizes[j]==differ) {
					answer[0]=aliceSizes[i];
					answer[1]=bobSizes[j];
					return answer;
				}
			}
		}
		
		
    	return answer;
    }
}