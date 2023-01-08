class Solution {
    public int romanToInt(String s) {
        int index = 0;
        
        HashMap<Character,Integer>romanMap = new HashMap<>();
        
        romanMap.put('I',1);
        romanMap.put('V',5);
        romanMap.put('X',10);
        romanMap.put('L',50);
        romanMap.put('C',100);
        romanMap.put('D',500);
        romanMap.put('M',1000);
        
        int val = 0;
        
        while(index<s.length()){
            if(index < s.length()-1 && romanMap.get(s.charAt(index)) < romanMap.get(s.charAt(index+1))){
                val+=romanMap.get(s.charAt(index+1)) - romanMap.get(s.charAt(index));
                index +=2;
            }
            else{
                val+=romanMap.get(s.charAt(index));
                index++;
            }
        }
                                  
        return val;
    }
}