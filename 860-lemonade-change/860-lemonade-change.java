class Solution {
    public boolean lemonadeChange(int[] bills) {
        int five=0;
		int ten=0;
		
		for(int bill : bills) {
			if(bill == 20) {
				if(ten>0 && five >0) {
					ten--;
					five--;
				}
				else if(five>2) {
					five-=3;
				}
				else {
					return false;
				}
			}
			else if(bill == 10) {
				if(five>0) {
					five--;
					ten++;
				}
				else {
					return false;
				}
			}
			else {
				five++;
			}
		}
		return true;
	}
}