class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<>();
        
        
        for(String email : emails){
            StringBuilder localName = new StringBuilder();
            String [] nameArr = email.split("@");
            
            for(int i=0;i<nameArr[0].length();i++){
                if(email.charAt(i)=='.'){
                    continue;
                }
                else if(email.charAt(i)=='+'){
                    break;
                }
                else{
                    localName.append(email.charAt(i));
                }
            }
        
            StringBuilder parsedEmail = new StringBuilder();
            
            parsedEmail.append(localName);
            parsedEmail.append("@"+nameArr[1]);
            emailSet.add(parsedEmail.toString());
        }
        
        return emailSet.size();
    }
}