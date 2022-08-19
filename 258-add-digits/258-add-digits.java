class Solution {
    public int addDigits(int num) {
        while(num>9) {
			String strNum = String.valueOf(num);
			
			num = Arrays.stream(strNum.split("")).mapToInt(s->Integer.valueOf(s)).sum();
		}	
        
        return num;
    }
}