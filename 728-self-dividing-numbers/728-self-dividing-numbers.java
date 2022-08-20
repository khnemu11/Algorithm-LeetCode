class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();
		
		for(int num=left;num<=right;num++) {
			int[] digit = Arrays.stream(String.valueOf(num).split(""))
					.mapToInt(n->Integer.valueOf(n)).toArray();
			boolean check = true;
			for(int i=0;i<digit.length;i++) {
				if(digit[i]==0 || num%digit[i]!=0) {
					check=false;
					break;
				}
			}
			if(check) {
				result.add(num);
			}
		}
		return result;
    }
}