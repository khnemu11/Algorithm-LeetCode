class Solution {
    public boolean isPerfectSquare(int num) {
        int start =1;
		int end = num;
		
		while(end>=start) {
			int mid = (end+start)/2;
			if(mid<num/mid) {
				start= mid+1;
			}
			else if((double)mid == (double)num/mid) {
				return true;
			}
			else {
				end=mid-1;
			}
		}
		
		return false;
    }
}