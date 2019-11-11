// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        String base = Integer.toString(N, 2);
		boolean isLastBitPostive = base.charAt(base.length()-1)=='1'?true:false;
		StringTokenizer st = new StringTokenizer(base, "1");
        int max = 0;
        while (st.hasMoreTokens()) {
        	String tmp = st.nextToken();
        	if (!isLastBitPostive && !st.hasMoreTokens())
        		break;
        	max = Math.max(max, tmp.length());
        }
        return max;
    }
}
