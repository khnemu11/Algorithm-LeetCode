class Solution {
    public String[] findRelativeRanks(int[] score) {
        String result[] = new String[score.length];
        Person personArr[]= new Person[score.length];
        
        for(int i=0;i<score.length;i++){
            personArr[i] = new Person(i+1,score[i]);
        }
        
        Arrays.sort(personArr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                return o2.score - o1.score;
            }
        });
        
        for(int i=0;i< personArr.length;i++){
            if(i==0){
                personArr[i].rank = "Gold Medal";
            }
            else if(i==1){
                personArr[i].rank = "Silver Medal";
            }
            else if(i==2){
                personArr[i].rank = "Bronze Medal";
            }
            else{
                personArr[i].rank = String.valueOf(i+1);    
            }
            
        }
        
         Arrays.sort(personArr, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2){
                return o1.val - o2.val;
            }
        });
        
        for(int i=0;i<personArr.length;i++){
            result[i] = personArr[i].rank;
        }
        
        return result;
    }
}
class Person{
    int val;
    int score;
    String rank;
    
    public Person(int val, int score){
        this.val = val;
        this.score = score;
    }
    
    public String toString(){
        return "val: "+val+" score "+score;
    }
}