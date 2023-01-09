class Solution {
    public List<String> restoreIpAddresses(String s) {
        int count = s.length()-1;
        List <String> result = new ArrayList<>();
        String [] address = new String [4];
        
        if(s.length()>12)   return result;
        
        for(int i=1;i<=count-2;i++){
            String num= s.substring(0,i);
            
            if(Integer.valueOf(num)>255 || (num.length()>1 && num.charAt(0) =='0'))  continue;
            address[0]= num;
            
            for(int j=i+1;j<=count-1;j++){
                num = s.substring(i,j);
                
                if(Integer.valueOf(num)>255 || (num.length()>1 && num.charAt(0) =='0'))  continue;
               address[1]= num;
                
                
                for(int k=j+1;k<=count;k++){
                    num =s.substring(j,k);
                    if(Integer.valueOf(num)>255 || (num.length()>1 && num.charAt(0) =='0'))  continue;
                   address[2]= num;
                    
                    num= s.substring(k,s.length());
                    
                    if(Integer.valueOf(num)>255 || (num.length()>1 && num.charAt(0) =='0')){
                        address[2]= "";
                        continue;
                    }  
                    address[3]= num;
                    
                    //System.out.println(Arrays.asList(address));
                    
                    result.add(address[0]+"."+address[1]+"."+address[2]+"."+address[3]);
                }
            }   
        }
        
        return result;
    }
}