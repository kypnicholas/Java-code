import java.util.Arrays;

public class Solution {
	
	/*A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
	N = 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. 
	N = 20 has binary representation 10100 and contains one binary gap of length 1. 
	N = 15 has binary representation 1111 and has no binary gaps.
	N = 1041 has binary representation 10000010001, the function should return 5
	
	Write a function:		class Solution { public int solution(int N); }
	that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.

	For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5.
	 */
	
	public static void main(String args[]){
        Solution obj = new Solution();
        System.out.println(obj.solution(529));
    }
	
	public int solution(int N) {
        String str = Integer.toBinaryString(N);				//convert integer to binary string. 						--> 529 is 1000010001
        str = str.replace("0", " ").trim();					//replace 0s at the end and trim							--> N = 1000010001
        String[] zeroGroups = str.split("1");				//split based on 1s and add all 0 groups in zeroGroups[]	--> zeroGroups = [0000,000]
        //System.out.println(Arrays.toString(zeroGroups));
        
        if (zeroGroups.length == 0) return 0;				//return 0 if N doesn't contain a binary gap
        
        int[] gaps = new int[zeroGroups.length];			//create gaps[] with as many positions as the zeroGroups we have
        for (int i = 0; i < zeroGroups.length; i++){
            gaps[i] = zeroGroups[i].length();				//get length of each zeroGroup and copy it to the respective gap[] position	--> gaps[4,3]
        }
        Arrays.sort(gaps);        							//sort ascending											--> gaps[3,4]
        return gaps[gaps.length-1];							//gaps.length=2. gaps.length-1=1. get result in position 1	--> 4
    }

}
