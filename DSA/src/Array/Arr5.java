package Array;
//Merge Overlapping Subintervals
/*if intervals are unsorted then sort them first O(nlog(n))
 *1.)In brute force approach in O(n2)for each intervals compare with other intervals  
 *2.)maintain start and end variable and solve the corner cases
 		CORNER CASES: if arr[0]>end then add new array of start and end in list
 					  if end <arr[1] then change end
*/

import java.util.ArrayList;

public class Arr5 {
	public ArrayList<int[]> solution(int[][] intervals) {
		int start=intervals[0][0];
		int end=intervals[0][1];
		ArrayList<int[]> answer=new ArrayList<int[]>();
		for(int[] interval : intervals) {
			if(end<interval[0]) {
				int[] a= {start,end};
				answer.add(a);
				start=-1;
				end=-1;
			}
			if(start==-1) {
				start=interval[0];
			}
			if(end<interval[1]) {
				end=interval[1];
			}
		}
		int[] a= {start,end};
		answer.add(a);
		return answer;
	}
}
