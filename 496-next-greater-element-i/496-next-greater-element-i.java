class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
         int [] answer = new int [nums1.length];
			 List<Integer>nums2List = Arrays.stream(nums2).boxed().collect(Collectors.toList());
			 
			 for(int i=0;i<nums1.length;i++) {
				 int index= nums2List.indexOf(nums1[i]);
				 int nextGreaterElement = -1;
				 
				 for(int j=index;j<nums2.length;j++) {
					 if(nums2[j]>nums1[i]) {
						 nextGreaterElement=nums2[j];
						 break;
					 }
				 }
				 
				 answer[i]=nextGreaterElement;
				 
			 }
			 
			 return answer;
    }
}