class Solution {
    public String countAndSay(int n) {
        String result ="1";
        
        if(n ==1)   return result;
        else{            
            for(int j=0;j<n-1;j++){
                List<String> numString= new ArrayList<>();
                List<Integer> numCount= new ArrayList<>();
                int count = 0;
                
                numString.add(String.valueOf(result.charAt(0)));
                numCount.add(1);
                
                for(int i=1;i<result.length();i++){
                    String num = String.valueOf(result.charAt(i));
                    String beforeNum = String.valueOf(result.charAt(i-1));
                    if(num.equals(beforeNum)==true){
                        numCount.set(numCount.size()-1,numCount.get(numCount.size()-1)+1);
                    }
                    else{
                        numString.add(num);
                        numCount.add(1);
                    }
                }
                result="";
        
                for(int i=0;i<numString.size();i++){
                    result+=String.valueOf(numCount.get(i));
                    result+=numString.get(i);
                }
            }

        }
        
        return result;
    }
}