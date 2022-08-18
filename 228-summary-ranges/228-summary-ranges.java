class Solution {
    public List<String> summaryRanges(int[] nums) {
   List<String> answer = new ArrayList<String>();
		int start=0;
		int end =0;
		
		if(nums.length>0) {
			for(int i=0;i<nums.length-1;i++) {
				if(nums[i+1]-nums[i]==1) {
					end++;
				}
				else if(nums[i+1]-nums[i]!=1) {
					if(start!=end) {
						StringBuilder sb = new StringBuilder();
						sb.append(nums[start]);
						sb.append("->");
						sb.append(nums[end]);
						answer.add(sb.toString());
					}
					else {
						answer.add(String.valueOf(nums[i]));
					}
					start=i+1;
					end=start;
				}
			}
			if(start!=end) {
				StringBuilder sb = new StringBuilder();
				sb.append(nums[start]);
				sb.append("->");
				sb.append(nums[end]);
				answer.add(sb.toString());
			}
			else {
				answer.add(String.valueOf(nums[start]));
			}
		}
        return answer;
    }
}