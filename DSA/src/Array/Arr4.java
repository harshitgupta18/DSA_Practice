package Array;
//KADEN'S ALGORITHM-Find maximum contigous subarray
public class Arr4 {
	public int solution(int[] array) {
		int sum=0;
		int max=0;
		for(int i:array) {
			if(sum<0) {
				sum=0;
			}
			else {
				sum=sum+i;
			}
			if(sum>max) {
				max=sum;
			}
		}
		return max;
	}
}
