import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> pascal = new ArrayList<List<Integer>>();
		for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<Integer>();
            if(i==0)  row.add(1);
            else{
            	row.add(1);
            	for(int j=1;j<=i-1;j++) {
            		row.add(pascal.get(i-1).get(j-1)+ pascal.get(i-1).get(j));
            	}
            	row.add(1);
            }

            pascal.add(row);
        }
        return pascal;
    }
}