import java.util.Arrays;

class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int result=0;
		Arrays.sort(g);
        Arrays.sort(s);
        int g_index=0;
        
		for(int s_index=0;s_index<s.length && g_index<g.length ;s_index++) {
			if(g[g_index]<=s[s_index]){
                g_index++;
                result++;
            }
		}
        return result;
    }
}