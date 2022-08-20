class Solution {
    public int mySqrt(int x) {
      int result=x;
		int start =1;
		int end = x;
		
		while(end>=start) {
			
			int mid = (end+start)/2;
			if(mid<x/mid) {
				result = mid;
				start= mid+1;
			}
			else if(mid == x/mid) {
				result =mid;
				break;
			}
			else {
				end=mid-1;
			}
		}
		
		return result;
    }
}