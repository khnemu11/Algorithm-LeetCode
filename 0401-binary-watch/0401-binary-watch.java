class Solution {
    List<String> list = new ArrayList<>();
    List<String> hList;
    List<String> mList;
    boolean hours[] = new boolean[4];
    boolean minutes[] = new boolean[6];
    
    public List<String> readBinaryWatch(int turnedOn) {
        //0000 : 000000
        if(turnedOn>8){
            return list;
        }
        for(int hLimit = 0;hLimit<4 && hLimit<=turnedOn;hLimit++){
            hList = new ArrayList<>();
            mList = new ArrayList<>();
            
            mSelect(0,turnedOn-hLimit,0);
            hSelect(0,hLimit,0);
            
            for(String hour : hList){
                for(String minute : mList){
                    list.add(hour+":"+minute);
                }   
            }
        }        
        Collections.sort(list);        
        return list;
    }
    
    public void mSelect(int curr, int limit,int idx){
        if(curr == limit){
            double sum=0;
             for(int i=0;i<minutes.length;i++){
                if(minutes[i]){
                    sum+=Math.pow(2,i);
                }    
            }
             if(sum<60){
                  if(sum>9){
                     mList.add(String.valueOf((int)sum));
                  }
                  else{
                     mList.add("0"+String.valueOf((int)sum));
                  }
              } 
            return ;
        } 
        else{
            for(int i=idx;i<minutes.length;i++){
                if(minutes[i]){
                    continue;
                }
                minutes[i]=true;
                mSelect(curr+1,limit,i+1);
                minutes[i]=false;
            }
        }
    }
    public void hSelect(int curr, int limit,int idx){
        if(curr == limit){
            double sum = 0;
            
            for(int i=0;i<hours.length;i++){
                if(hours[i]){
                    sum+=Math.pow(2,i);
                }    
            }
            
              if(sum<12){
                hList.add(String.valueOf((int)sum));
              } 
              return ;
        } 
        else{
            for(int i=idx;i<hours.length;i++){
                if(hours[i]){
                    continue;
                }
                hours[i]=true;
                hSelect(curr+1,limit,i+1);
                hours[i]=false;
            }
        }
    }
}