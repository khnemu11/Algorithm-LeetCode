class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1Index = 0, num2Index = 0;
        
        int [] nums1Copy = Arrays.copyOfRange(nums1, 0, m);
        
        int curr =0;
        
        for(;curr<nums1.length;curr++) {
        	if(num1Index >= m || num2Index >= n) {
        		break;
        	}
        	if(nums1Copy[num1Index]<nums2[num2Index]) {
        		nums1[curr] = nums1Copy[num1Index];
        		num1Index++;
        	}
        	else {
        		nums1[curr] = nums2[num2Index];
        		num2Index++;
        	}
        }
        
        if(num1Index < m) {
        	for(;curr<nums1.length;curr++,num1Index++) {
        		nums1[curr] = nums1Copy[num1Index];
        	}
        }
        else if(num2Index < n) {
        	for(;curr<nums1.length;curr++,num2Index++) {
        		nums1[curr] = nums2[num2Index];
        	}
        }
    }
}